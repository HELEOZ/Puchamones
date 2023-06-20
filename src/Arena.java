

/**
 * Class Arena
 */
//TODO https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Random.html
public class Arena {
  private Jugador jugador;
  private Puchamon[] rivales;

  //
  // Fields
  //


  //
  // Constructors
  //
  public Arena (Jugador jugador) {
    this.jugador = jugador;
    this.rivales = new Puchamon[3];
  };

  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  public boolean tieneRivalesVivos() {
    for (Puchamon p : rivales) {
      if (p.estaVivo()) {
        return true;
      }
    }
    return false;
  }

}
