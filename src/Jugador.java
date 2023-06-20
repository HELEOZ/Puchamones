import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class Jugador
 */
//TODO https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/BufferedReader.html.
//TODO https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/FileReader.html.
//TODO https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/IOException.html.
//TODO https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Scanner.html
public class Jugador extends Usuario {

    //
    // Fields
    //
    private double Dinero;
    private int Equipo;
    private int Experiencia;
    private int Nivel;

    private int con=0;

    Scanner scanner =new Scanner(System.in);
    //
    // Constructors
    //
    public Jugador () { };

    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Set the value of Dinero
     * @param newVar the new value of Dinero
     */
    public void setDinero (double newVar) {
        Dinero = newVar;
    }

    /**
     * Get the value of Dinero
     * @return the value of Dinero
     */
    public double getDinero () {
        return Dinero;
    }

    /**
     * Set the value of Equipo
     * @param newVar the new value of Equipo
     */
    public void setEquipo (int newVar) {
        Equipo = newVar;
    }

    /**
     * Get the value of Equipo
     * @return the value of Equipo
     */
    public int getEquipo () {
        return Equipo;
    }

    /**
     * Set the value of Experiencia
     * @param newVar the new value of Experiencia
     */
    public void setExperiencia (int newVar) {
        Experiencia = newVar;
    }

    /**
     * Get the value of Experiencia
     * @return the value of Experiencia
     */
    public int getExperiencia () {
        return Experiencia;
    }

    /**
     * Set the value of Nivel
     * @param newVar the new value of Nivel
     */
    public void setNivel (int newVar) {
        Nivel = newVar;
    }

    /**
     * Get the value of Nivel
     * @return the value of Nivel
     */
    public int getNivel () {
        return Nivel;
    }

    //
    // Other methods
    //

    /**
     */
    public void Bienvenida(){
        Dinero=2000;
        Nivel=1;
        Experiencia=0;
        System.out.println("Tu bono de bienvenida es:"+ this.Dinero + "Monedas de oro");

        agregarDatos("monedas", String.valueOf(Dinero));
        agregarDatos("Nivel ", String.valueOf(Nivel));
        agregarDatos("Experiencia ", String.valueOf(Experiencia));
        mostrarDatos();
        System.out.println("Para Empezar Necesitas 3 puchamones para iniciar");
        System.out.println("Nombre de Puchamones 1");
        AgregarPuchamon();
        System.out.println("Nombre de Puchamones 2");
        AgregarPuchamon();
        System.out.println("Nombre de Puchamones 3");
        AgregarPuchamon();
        Menu();
    }


    /**
     */
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
    /**
     */
    public void Menu(){
        int opcion;
        System.out.println("--------Menu---------");
        System.out.println("Escriba el numero de la opcion que desea:");
        System.out.println("1.Revisar equipo");
        System.out.println("2.Agregar Puchamones");
        System.out.println("3.Pelear en arena");
        System.out.println("4.Ver Estadisticas");
        System.out.println("5.Salir");
        opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                //EquipoPuchamon();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                return;
        }
    }
    /**
     */
    public void revisarEquipo()
    {
    }


    /**
     */
    public void AgregarPuchamon() {
        if ( con >= 0 && con < 3){
            String nombre;
            String tipo="";
            System.out.println("Nombre del Puchamon");
            nombre = scanner.next();
            System.out.println("Tipos: Tierra, Agua, Aire, Fuego");
            tipo = scanner.next().toUpperCase();
            if(tipo == "TIERRA" || tipo == "AGUA" || tipo=="AIRE" || tipo=="FUEGO"){
                Puchamon nuevoPuchamon = new Puchamon(nombre, String.valueOf(tipo));
                agregarDatos("Puchamon",tipo);
                con++;
            }
            else {
                System.out.println("No a agregado un tipo valido");
                AgregarPuchamon();
            }
        }
        else {
            System.out.println("El limite de Puchamones es 3 si desea agregar uno tendra que borrar un puchamon");
        }

    }

    /**
     */
    public void RevisarEquipo()
    {

    }
    public void EliminarPuchamon(){

    }


    /**
     */
}
