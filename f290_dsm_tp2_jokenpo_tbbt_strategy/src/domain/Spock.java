package domain;

public class Spock implements Algoritmo {

  @Override
  public void excecutar(TipoAlgoritmo tipo) {
    switch (tipo) {
      case PAPEL:
        System.out.println("Perdeu: Papel refuta Spock.");
        break;
      case LAGARTO:
        System.out.println("Perdeu: Lagarto envenena Spock.");
        break;
      case TESOURA:
        System.out.println("Ganhou: Spock derrete tesoura.");
        break;
      case PEDRA:
        System.out.println("Ganhou: Spock vaporiza pdera.");
        break;
      default:
        System.out.println("Empatou: Spock empata com Spock");
    }
  }

}
