import java.util.Random;
import java.util.Scanner;

import domain.Algoritmo;
import domain.Jokenpo;
import domain.Papel;
import domain.Pedra;
import domain.Tesoura;
import domain.Lagarto;
import domain.Spock;
import domain.TipoAlgoritmo;

public class App {
    public static int PAPEL = 1;
    public static int TESOURA = 2;
    public static int PEDRA = 3;
    public static int LAGARTO = 4;
    public static int SPOCK = 5;



    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecione umas das opções:");
        System.out.println("Papel: 1");
        System.out.println("Tesoura:2");
        System.out.println("Pedra: 3");
        System.out.println("lagarto: 4");
        System.out.println("Spock: 5");
        System.out.println();

        //Todo: Criar funcao para converte int em Algoritmo
        Algoritmo papel = new Papel();
        
        //Todos: Gerar jogada randomica e converte em Enum
        Integer random = new Random().nextInt(5) +1;
        TipoAlgoritmo computador = TipoAlgoritmo.getTipo(random);

        Jokenpo jokenpo = new Jokenpo();
        jokenpo.setAlgoritmo(papel);
        
        jokenpo.jogar(computador);

        in.close();
        
    }

    static Algoritmo getAlgoritmo(Integer id) {
        TipoAlgoritmo tipo = TipoAlgoritmo.getTipo(id);
        switch(tipo){
            case PAPEL:
                return new Papel();
            case TESOURA:
                return new Tesoura();
            case PEDRA:
                return new Pedra();
            case LAGARTO:
                return new Lagarto();
            case SPOCK:
                return new Spock();
            default:
             throw new RuntimeException("Tipo invalido.");        
        }
    }
}
