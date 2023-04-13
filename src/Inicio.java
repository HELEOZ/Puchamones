import javax.swing.*;
import java.util.Scanner;
public class Inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir=true;
        String[] tipoConversor ={"Registrarme","Iniciar sesión"};

        int Menu = JOptionPane.showOptionDialog(null,"Jugador Nuevo o ya existente:","Convertidores",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,tipoConversor,tipoConversor[1]);
        String input;
        input = JOptionPane.showInputDialog(null, "Ingrese Usuario");

        while (seguir==true){
            if (Menu == 0) {
                System.out.println("Ingresa tu nombre:");
                String nombre = scanner.next();
                System.out.println("Ingresa una contraseña:");
                String clave = scanner.next();
                Usuario usuario = new Usuario(nombre,clave);
            }
            else if (Menu == 1){
                System.out.println("Ingresa tu nombre:");
                String nombre = scanner.next();
                System.out.println("Ingresa una contraseña:");
                String clave = scanner.next();
                Usuario usuario = new Usuario(nombre,clave);
            }
            else {
                seguir=false;
                System.out.println("Opción inválida");
            }
        }
    }
}