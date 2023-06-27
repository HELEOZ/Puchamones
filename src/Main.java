import javax.swing.*;

//TODO https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/FileReader.html.

//Lo sentimos no pudimos es nuestra primero corrida(piedad jeje)
public class Main {
    public static void main(String[] args) {
        boolean repetir= false;
        Jugador jugador = new Jugador();
        String[] login = {"Registrarme", "Iniciar sesión","Salir"};
        //Probando conexion de github
        while (!repetir){
            int menu = JOptionPane.showOptionDialog(null, "Jugador Nuevo o Tengo una Cuenta:", "Login",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, login, login[2]);

            if (menu == 0) {
                jugador.registrarse();
                jugador.Bienvenida();
            } else if (menu == 1) {
                jugador.iniciarSesion();
                if (jugador.buscarArchivo()==true) {
                    jugador.mostrarDatos();
                    jugador.Menu();
                }

            }
            else{
                repetir=true;
            }
        }
    }
}