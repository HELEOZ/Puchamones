

/**
 * Class Puchamon
 */
//Todo https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Random.html
public class Puchamon {

    //
    // Fields
    //

    private String nombre;
    int[] tipos = new int[3];
    private int ataque;
    private int defensa;
    private int nivel;
    private int vida;
    private int experiencia;
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
    private static final double EXP_NECESARIA_SUBIR_NIVEL = 100.0;
    //
    // Constructors
    //
    public Puchamon(String nombre, String tipo) {
        this.nombre = nombre;
        // this.tipos = tipo;
        this.ataque = ATAQUE_INICIAL + (int) (Math.random() * (101 - ATAQUE_INICIAL));
        this.defensa = DEFENSA_INICIAL + (int) (Math.random() * (101 - DEFENSA_INICIAL));
        this.vida = VIDA_INICIAL;
        this.experiencia = 0;
        this.nivel = 1;
        this.cantidadCombates = 0;
        this.combatesGanados = 0;
        this.combatesPerdidos = 0;
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
    public void setNombre (String newVar) {
        nombre = newVar;
    }

    /**
     * Get the value of Nombre
     * @return the value of Nombre
     */
    public String getNombre () {
        return nombre;
    }

    public void setTipos(int[] tipos) {
        this.tipos = tipos;
    }

    /**
     * Set the value of ataque
     * @param newVar the new value of ataque
     */
    public void setAtaque (int newVar) {
        ataque = newVar;
    }

    /**
     * Get the value of ataque
     * @return the value of ataque
     */
    public int getAtaque () {
        return ataque;
    }

    /**
     * Set the value of Defensa
     * @param newVar the new value of Defensa
     */
    public void setDefensa (int newVar) {
        defensa = newVar;
    }

    /**
     * Get the value of Defensa
     * @return the value of Defensa
     */
    public int getDefensa () {
        return defensa;
    }

    /**
     * Set the value of nivel
     * @param newVar the new value of nivel
     */
    public void setNivel (int newVar) {
        nivel = newVar;
    }

    /**
     * Get the value of nivel
     * @return the value of nivel
     */
    public int getNivel () {
        return nivel;
    }

    /**
     * Set the value of vida
     * @param newVar the new value of vida
     */
    public void setVida (int newVar) {
        vida = newVar;
    }

    /**
     * Get the value of vida
     * @return the value of vida
     */
    public int getVida () {
        return vida;
    }

    /**
     */
    public void subirNivel() {
        this.nivel++;
        this.experiencia = 0;
        this.vida += INCREMENTO_NIVEL_VIDA;
        this.ataque += (int) ((nivel + 1) * INCREMENTO_ATAQUE_DEFENSA);
        this.defensa += (int) ((nivel + 1) * INCREMENTO_ATAQUE_DEFENSA);
    }


    /**
     * @param vidaRestante
     */
    public void ganarCombate(int vidaRestante) {
        this.experiencia += vidaRestante / EXP_NECESARIA_SUBIR_NIVEL;
        this.combatesGanados++;
        this.cantidadCombates++;
        if (this.experiencia >= EXP_SUBIR_NIVEL) {
            subirNivel();
        }
    }

    /**
     */
    public void perderCombate() {
        this.combatesPerdidos++;
        this.cantidadCombates++;
    }

    /**
     * @return       boolean
     */
    public boolean estaVivo() {
        return vida > 0;
    }
    /**
     */
}
