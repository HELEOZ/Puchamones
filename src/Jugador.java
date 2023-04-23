import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class Jugador
 */
public class Jugador extends Usuario {
  private double Dinero;
  private String[] Equipo;
  private int Experiencia;
  private int Nivel;
  //
  // Constructors
  //
  public Jugador () {

  };

  public void Bienvenida(){
    Dinero=2000;
    Nivel=1;
    Experiencia=1;
    agregarDatos("Dinero", String.valueOf(Dinero));
    agregarDatos("Nivel ", String.valueOf(Nivel));
    agregarDatos("Experiencia ", String.valueOf(Experiencia));
    mostrarDatos();
    System.out.println("Necesitas 3 puchamones para iniciar");
    crearPuchamon();
  }
  public void mostrarDatos() {
      String archivo = getNombre() + "," + getClave() + ".txt";
      try {
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
          System.out.println(linea);
        }
        br.close();
      } catch (IOException e) {
        System.err.println("Error al leer el archivo");
      }
    }

  public void crearPuchamon()
  {

  }


  /**
   */
  public void eliminarPuchamon()
  {
  }


  /**
   */
  public void subirExperiencia()
  {
  }


  /**
   */
  public void revisarEquipo()
  {
  }


  /**
   */
  public void agregarPuchamonesEquipo()
  {
  }


  /**
   */
  public void pelearEnArena()
  {
  }


  /**
   */
  public void verEstadisticas()
  {
  }


}
