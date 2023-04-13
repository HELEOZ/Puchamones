import java.io.*;
import java.util.Scanner;

/**
 * Class Usuario
 */
public class Usuario {

  //
  // Fields
  //
  private String Nombre;
  private String Clave;

  private int opcion;
  //
  // Constructors
  //
  Scanner sc = new Scanner(System.in);
  public Usuario (String nombre, String clave) {
    this.Nombre = nombre;
    this.Clave = clave;


  };
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
  public void setNombre (String newVar) {
    Nombre = newVar;
  } //leer valores
  /**
   * Get the value of Nombre
   * @return the value of Nombre
   */
  public String getNombre () {
    return Nombre;
  } //

  /**
   * Set the value of Clave
   * @param newVar the new value of Clave
   */
  public void setClave (String newVar) {
    Clave = newVar;
  }

  /**
   * Get the value of Clave
   * @return the value of Clave
   */
  public String getClave () {
    return Clave;
  }
  //
  // Other methods
  //
  /**
   * @param        nombre
   */
  public void agregarUsuario(String nombre,String Clave)
  {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true));
      writer.write(nombre + "," + Clave);
      writer.newLine();
      writer.close();
      System.out.println("Usuario agregado correctamente.");
    } catch (IOException e) {
      System.out.println("Ocurrió un error al agregar el usuario.");
      e.printStackTrace();

    }
  }
  /**
   * @param        Clave
   */
  public boolean autenticarUsuario(String nombre,String Clave) {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"));
      String linea;
      while ((linea = reader.readLine()) != null) {
        String[] partes = linea.split(",");
        if (partes[0].equals(nombre) && partes[1].equals(Clave)) {
          reader.close();
          return true;
        }
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("Ocurrió un error al leer el archivo de usuarios.");
      e.printStackTrace();
    }
    return false;
  }
  /**
   * @param        nombre
   */
  public void Bienvenida(String nombre){

  }


}
