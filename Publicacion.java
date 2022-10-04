/*
 * Clase padre de la jerarquía de la bliblioteca
 * maneja los elementos comunes de cualquier tipo de publicación
 * @author POO-10
 * @date 29-09-2022
 */
public class Publicacion {
    protected int id;
    protected String titulo;
    protected String materia;
    protected int cantEjemplares;
    protected String estado; //disponible o agotado


    public Publicacion() {
        id = 0;
        titulo = "";
        materia = "";
        cantEjemplares = 1;
        estado = "disponible";
    }


    public Publicacion(int id, String titulo, String materia, int cantEjemplares, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.cantEjemplares = cantEjemplares;
        this.estado = estado;
    }


    
    /** 
     * @return int
     */
    public int getId() {
        return this.id;
    }

    
    /** 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /** 
     * @return String
     */
    public String getTitulo() {
        return this.titulo;
    }

    
    /** 
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    /** 
     * @return String
     */
    public String getMateria() {
        return this.materia;
    }

    
    /** 
     * @param materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    
    /** 
     * @return int
     */
    public int getCantEjemplares() {
        return this.cantEjemplares;
    }

    
    /** 
     * @param cantEjemplares
     */
    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    
    /** 
     * @return String
     */
    public String getEstado() {
        return this.estado;
    }

    
    /** 
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", materia='" + getMateria() + "'" +
            ", cantEjemplares='" + getCantEjemplares() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }


}
