package domain;

public class Papel implements Algoritmo {

    @Override
    public void excecutar(TipoAlgoritmo tipo) {
        switch(tipo) {
            case PEDRA: 
                System.out.println("Ganhou: Papel embulha Pedra.");
                break;
            
            case SPOCK: 
                System.out.println("Ganhou: Papel refulta o Spock.");
                break;
           
            case TESOURA: 
                System.out.println("Perdeu: Tesoura corta Papel.");
                break;
            
            case LAGARTO: 
                System.out.println("Perdeu: Lagarto com o Papel.");
                break;
         
            default:
                System.out.println("Empatou: Papel empata com Papel");

        }
    }
    
}
