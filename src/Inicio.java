import javax.swing.*;
//todo https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
public class Inicio {
    public static void main(String[] args) {
        boolean repetir= false;
        Jugador jugador = new Jugador();
        String[] tipoConversor = {"Registrarme", "Iniciar sesión"};

            int menu = JOptionPane.showOptionDialog(null, "Jugador Nuevo o Tengo una Cuenta:", "Convertidores",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipoConversor, tipoConversor[1]);
            if (menu == 0) {
                ((Usuario)jugador).registrarse();
                jugador.Bienvenida();
            } else if (menu == 1) {
                jugador.iniciarSesion();
                if (jugador.buscarArchivo()) {
                    jugador.mostrarDatos();
                }
            }

    }
}