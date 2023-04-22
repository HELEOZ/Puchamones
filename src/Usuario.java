import javax.swing.JOptionPane;
import java.io.*;

public abstract class  Usuario {
  private String nombre;
  private String clave;
  public Usuario() {
    nombre = "";
    clave = "";
  }
  public String getNombre() {
    return nombre;
  }

  public String getClave() {
    return clave;
  }

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

  public void iniciarSesion() {
      nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
      clave = JOptionPane.showInputDialog(null, "Ingrese su clave:");
      if (nombre == null || clave == null) {
        return; // Salir del método si el usuario presiona "Cancelar"
      }
        if (buscarArchivo() == false) {
          JOptionPane.showMessageDialog(null, "El Nombre de Usuario o la contraseña son incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  public boolean buscarArchivo() {
    String archivo = nombre + "," + clave + ".txt"; // nombre del archivo
    File f = new File(archivo);
    if (f.exists() && !f.isDirectory()) {
      return true; // si el archivo existe y no es un directorio, retorna verdadero
    }
    return false; // si no, retorna falso
  }
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

}
