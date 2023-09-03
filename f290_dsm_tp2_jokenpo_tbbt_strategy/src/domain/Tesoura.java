package domain;

public class Tesoura implements Algoritmo {

  @Override
  public void excecutar(TipoAlgoritmo tipo) {

    switch (tipo) {
      case PAPEL:
        System.out.println("Ganhou! Tesoura corta papel.");
        break;
      case LAGARTO:
        System.out.println("Ganhou! Tesoura decapita lagarto.");
        break;
      case PEDRA:
        System.out.println("Perdeu! Pedra esmaga tesoura.");
        break;
      case SPOCK:
        System.out.println("Perdeu! Spock derrete tesoura");
        break;
      default:
        System.out.println("Empatou! Tesoura empata com tesoura");
    }
  }

}
