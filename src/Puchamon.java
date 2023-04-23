public class Puchamon {
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private int vida;
    private int experiencia;
    private int nivel;
    private int cantidadCombates;
    private int combatesGanados;
    private int combatesPerdidos;
    private static final int ATAQUE_INICIAL = 50;
    private static final int DEFENSA_INICIAL = 50;
    private static final int VIDA_INICIAL = 100;
    private static final int EXP_SUBIR_NIVEL = 100;
    private static final int ORO_SUBIR_NIVEL = 1000;
    private static final double INCREMENTO_ATAQUE_DEFENSA = 0.2;
    private static final int INCREMENTO_NIVEL_VIDA = 50;
    private static final int MIN_APUESTA = 100;


    public Puchamon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ATAQUE_INICIAL + (int) (Math.random() * (101 - ATAQUE_INICIAL));
        this.defensa = DEFENSA_INICIAL + (int) (Math.random() * (101 - DEFENSA_INICIAL));
        this.vida = VIDA_INICIAL;
        this.experiencia = 0;
        this.nivel = 0;
        this.cantidadCombates = 0;
        this.combatesGanados = 0;
        this.combatesPerdidos = 0;
    }

    public void subirNivel() {
        this.nivel++;
        this.experiencia = 0;
        this.vida += INCREMENTO_NIVEL_VIDA;
        this.ataque += (int) ((nivel + 1) * INCREMENTO_ATAQUE_DEFENSA);
        this.defensa += (int) ((nivel + 1) * INCREMENTO_ATAQUE_DEFENSA);
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void reducirVida(int cantidad) {
        vida -= cantidad;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void reiniciarVida() {
        vida = vidaMaxima;
    }
}
/*
public class Jugador {
    public void crearPuchamon(String nombre, String tipo) {
        // Generar valores aleatorios para ataque y defensa
        int ataque = (int) (Math.random() * 51) + 50; // Valores entre 50 y 100
        int defensa = (int) (Math.random() * 51) + 50; // Valores entre 50 y 100

        // para crear instancia de la clase Puchamon con los valores generados y los demás atributos en 0
        Puchamon nuevoPuchamon = new Puchamon(nombre, tipo, ataque, defensa, 0, 0, 0, 0);

        // y creo que se podria agregar el nuevo Puchamon al equipo del jugador asi...
        equipo.add(nuevoPuchamon);
    }
}
*/
