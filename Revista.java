/*
 * Clase que maneja la información de los revista
 * @author POO-10
 * @date 29-09-2022
 */
public class Revista extends Publicacion {
    private int numero;
    private int anio;


    public Revista() {
        super();
        numero = 0;
        anio = 0;
    }


    public Revista(int id, String titulo, String materia, int cantEjemplares, String estado,
    int numero, int anio) {
        super(id, titulo, materia, cantEjemplares, estado);
        this.numero = numero;
        this.anio = anio;
    }


    
    /** 
     * @return int
     */
    public int getNumero() {
        return this.numero;
    }

    
    /** 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    /** 
     * @return int
     */
    public int getAnio() {
        return this.anio;
    }

    
    /** 
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", anio='" + getAnio() + "'" +
            "}";
    }


}

