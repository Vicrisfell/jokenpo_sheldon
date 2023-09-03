package domain;

public class Pedra implements Algoritmo{

    @Override
    public void excecutar(TipoAlgoritmo tipo) {
        switch(tipo) {
            case PAPEL: 
                System.out.println("Perdeu: Papel embulha Pedra.");
                break;
            
            case SPOCK: 
                System.out.println("Perdeu: Spock vaporiza Pedra.");
                break;
           
            case TESOURA: 
                System.out.println("Ganhou: Pedra esmaga Tesoura.");
                break;
            
            case LAGARTO: 
                System.out.println("Ganhou: Pedra esmaga Lagarto.");
                break;
         
            default:
                System.out.println("Empatou: Pedra empata com Pedra.");

        }
    }
}
