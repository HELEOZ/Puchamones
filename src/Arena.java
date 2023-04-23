import java.util.Random;

public class Arena {
  private Jugador jugador;
  private Puchamon[] rivales;

  public Arena(Jugador jugador) {
    this.jugador = jugador;
    this.rivales = new Puchamon[3];
  }

  public void generarRivales() {
    int mediaNivel = jugador.calcularMediaNivel();
    int minNivel = Math.max(mediaNivel - 2, 0);
    int maxNivel = mediaNivel + 1;

    Random rand = new Random();

    for (int i = 0; i < 3; i++) {
      String nombre = "Rival " + (i + 1);
      int nivel = rand.nextInt(maxNivel - minNivel + 1) + minNivel;
      int ataque = rand.nextInt(51) + 50;
      int defensa = rand.nextInt(51) + 50;
      Puchamon rival = new Puchamon(nombre, TipoPuchamon.getRandomTipo(), nivel, ataque, defensa);
      rivales[i] = rival;
    }


    public void batalla () {
      int apuesta = 100;
      generarRivales();
      Puchamon puchamonJugador = jugador.getPuchamonActivo();
      Puchamon puchamonRival = rivales.get(0);
      Random rand = new Random();
      while (jugador.tienePuchamonesVivos() && tieneRivalesVivos()) {
        if (rand.nextBoolean()) {
          // Turno del jugador
          if (rand.nextBoolean()) {
            // Ataque del jugador
            int ataque = puchamonJugador.getAtaque();
            int defensa = puchamonRival.getDefensa();
            if (defensa < ataque) {
              puchamonRival.reducirVida(ataque - defensa);
              if (!puchamonRival.estaVivo()) {
                // El rival ha sido derrotado
                int index = rivales.indexOf(puchamonRival);
                if (index < rivales.size() - 1) {
                  puchamonRival = rivales.get(index + 1);
                }
              }
            }
          } else {
            // creo que no hay defensa del jugador
          }
        } else {
          // Turno del rival
          if (rand.nextBoolean()) {
            // Ataque del rival
            int ataque = puchamonRival.getAtaque();
            int defensa = puchamonJugador.getDefensa();
            if (defensa < ataque) {
              puchamonJugador.reducirVida(ataque - defensa);
              if (!puchamonJugador.estaVivo()) {
                // El jugador ha sido derrotado
                puchamonJugador = jugador.siguientePuchamonVivo();
              }
            }
          } else {
            // y creo que no hay defensa rival
          }
        }
      }
      if (jugador.tienePuchamonesVivos()) {
        jugador.agregarDinero(apuesta);
      } else {
        jugador.restarDinero(apuesta);
      }
      jugador.reiniciarVidaPuchamones();
      rivales.clear();
    }
  }
  public boolean tieneRivalesVivos() {
    for (Puchamon p : rivales) {
      if (p.estaVivo()) {
        return true;
      }
    }
    return false;
  }
}