package domain;

public class Lagarto implements Algoritmo {

  @Override
  public void excecutar (TipoAlgoritmo tipo){
    switch (tipo) {
      case PEDRA:
        System.out.println("Perdeu: Pedra esmaga lagarto.");
        break;
      case TESOURA:
        System.out.println("Perdeu: Tesoura decapita lagarto.");
        break;
      case SPOCK:
        System.out.println("Venceu: Lagarto envenena Spock.");
        break;
      case PAPEL:
        System.out.println("Venceu: Lagarto come papel.");
        break;
      default:
        System.out.println("Empatou: Lagarto empata com lagarto");
    }
  }

}
