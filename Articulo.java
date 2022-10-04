/*
 * Clase que maneja la información de los artículos
 * @author POO-10
 * @date 29-09-2022
 */
public class Articulo extends Publicacion{
    private String arbitro;
    private String autor;


    public Articulo() {
        super();
        arbitro = "";
        autor = "";
    }


    public Articulo(int id, String titulo, String materia, int cantEjemplares, String estado,
    String arbitro, String autor) {
        super(id, titulo, materia, cantEjemplares, estado);
        this.arbitro = arbitro;
        this.autor = autor;
    }



    
    /** 
     * @return String
     */
    public String getArbitro() {
        return this.arbitro;
    }

    
    /** 
     * @param arbitro
     */
    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    
    /** 
     * @return String
     */
    public String getAutor() {
        return this.autor;
    }

    
    /** 
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " arbitro='" + getArbitro() + "'" +
            ", autor='" + getAutor() + "'" +
            "}";
    }


}
