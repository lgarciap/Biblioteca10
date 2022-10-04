/*
 * Clase que maneja la información de los libros
 * @author POO-10
 * @date 29-09-2022
 */
public class Libro extends Publicacion {
    private String editorial;
    private String autor;


    public Libro() {
        super();
        editorial = "";
        autor = "";
    }


    public Libro(int id, String titulo, String materia, int cantEjemplares, String estado,
    String editorial, String autor) {
        super(id, titulo, materia, cantEjemplares, estado);
        this.editorial = editorial;
        this.autor = autor;
    }


    
    /** 
     * @return String
     */
    public String getEditorial() {
        return this.editorial;
    }

    
    /** 
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
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
            " editorial='" + getEditorial() + "'" +
            ", autor='" + getAutor() + "'" +
            "}";
    }

    
}
