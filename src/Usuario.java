import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class Usuario
 */

public abstract class Usuario {

  //
  // Fields
  //

  private String nombre;
  private String clave;

  //
  // Constructors
  //
  public Usuario() {
    nombre = "";
    clave = "";
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Nombre
   * @param newVar the new value of Nombre
   */

  /**
   * Get the value of Nombre
   * @return the value of Nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of Clave
   * @param newVar the new value of Clave
   */

  /**
   * Get the value of Clave
   * @return the value of Clave
   */
  public String getClave () {
    return clave;
  }

  //
  // Other methods
  //

  /**
   */
  public void registrarse() {
    nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
    clave = JOptionPane.showInputDialog(null, "Ingrese su clave:");
    if (nombre == null || clave == null) {
      return; // Salir del método si el usuario presiona "Cancelar"
    }
    agregarDatos("Nombre", nombre);
    JOptionPane.showMessageDialog(null,  "Iniciando interface de juego(consola))");
    System.out.println("Bienvenido " + nombre + " a la batalla de Puchamones");
  }



  /**
   */
  public void iniciarSesion() {
    nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
    if (nombre == null) {
      return; // Salir del método si el usuario presiona "Cancelar"
    }
    clave = JOptionPane.showInputDialog(null, "Ingrese su clave:");
    if (clave == null) {
      return; // Salir del método si el usuario presiona "Cancelar"
    }
    if (buscarArchivo() == false) {
      JOptionPane.showMessageDialog(null, "El Nombre de Usuario o la contraseña son incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }
  }
  /**
   * @param        NombreAtributo
   * @param        valor
   */
  public void agregarDatos(String NombreAtributo, String valor) {
    String archivo = nombre + "," + clave + ".txt"; // nombre del archivo
    try {
      FileWriter fw = new FileWriter(archivo, true);
      fw.write(NombreAtributo + ": " + valor + "\n");
      fw.close();
    } catch (IOException e) {
      System.err.println("Error al Guardar los datos");
    }
  }
  /**
   * @return       boolean
   */
  public boolean buscarArchivo() {
    String archivo = nombre + "," + clave + ".txt"; // nombre del archivo
    File f = new File(archivo); //Busca el archivo
    if (f.exists() && !f.isDirectory()) {
      return true; // si el archivo existe y no es un directorio, retorna verdadero
    }
    return false; // si no, retorna falso
  }
}
