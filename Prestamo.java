import java.util.Date;

public class Prestamo {
    private Date fechaSolicitud;
    private Date fechaDevolucion;
    private Libro libro;
    private Revista revista;
    private Articulo articulo;

    /* 
     * 
     * Reserva memoria para todos los objetos, la fecha inicial es la del servidor
    */
    public Prestamo() {
        fechaSolicitud = new Date();
        fechaDevolucion = null;
        libro = new Libro();
        revista = new Revista();
        articulo = new Articulo();
    }

    /**
     * Reserva memoria solo para el tipo de documento que se especifica, la fecha de inicio es la fecha del sistema
     * @param tipoPublicacion 1: libro, 2: revista,  3: articulo
    */
    public Prestamo(int tipoPublicacion) {
        //1. Libro, 2. Revista y 3. Articulo
        fechaSolicitud = new Date();
        fechaDevolucion = null;
        switch (tipoPublicacion) {
            case 1:
                libro = new Libro();
                revista = null;
                articulo = null;
                break;
            case 2:
                revista = new Revista();
                libro = null;
                articulo = null;
                break;
            case 3:
                articulo = new Articulo();
                libro = null;
                articulo = null;
                break;
        }
    }

    /**
     * Reserva memoria solo para el tipo que se especifica, la fecha de inicio es la fecha del sistema
     * @param tipoPublicacion 1: libro, 2: revista,  3: articulo
     * @param id: numero de identificacion de la publicacion. Numero de 6 digitos
     * @param titulo: titulo de la publicacion
     * @param materia: Materia de la publicación, ej: Mate, Física, etc
     * @param cantEjemplares: Cantidad de ejemplares disponibles
     * @param estado: disponible o agotado
     * @param editorial: La editorial del libro, en caso de que sea un libro
     * @param autor: El autor del libro o artículo, en caso de que sea libro o artículo
     * @param numero: El número de la revista
     * @param anio: El año de la revista
     * @param arbitro: El árbitro revisor del artículo
     */
    public Prestamo(int tipoPublicacion,int id, String titulo, String materia, int cantEjemplares, String estado,
    String editorial, String autor,int numero, int anio,String arbitro){
        //1. Libro, 2. Revista y 3. Articulo
        fechaSolicitud = new Date();
        fechaDevolucion = null;
        switch (tipoPublicacion) {
            case 1:
                libro = new Libro(id, titulo, materia, cantEjemplares, estado, editorial, autor);
                break;
            case 2:
                revista = new Revista(id, titulo, materia, cantEjemplares, estado, numero, anio);
                break;
            case 3: 
                articulo = new Articulo(id, titulo, materia, cantEjemplares, estado, arbitro, autor);
                break;
        }
    }

    public Prestamo (int tipoPublicacion, Libro libro, Revista revista, Articulo articulo, int cantDias){
        switch (tipoPublicacion) {
            case 1:
                this.libro = libro;
                break;
            case 2:
                this.revista = revista;
                break;
            case 3: 
                this.articulo = articulo;
                break;
        }
        fechaSolicitud = new Date();
        //fechaDevolucion = new Date() + cantDias;
    }

    
    /** 
     * @return Date
     */
    public Date getFechaSolicitud() {
        return this.fechaSolicitud;
    }

    
    /** 
     * @param fechaSolicitud
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    
    /** 
     * @return Date
     */
    public Date getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    
    /** 
     * @param fechaDevolucion
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    
    /** 
     * @return Libro
     */
    public Libro getLibro() {
        return this.libro;
    }

    
    /** 
     * @param libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    
    /** 
     * @return Revista
     */
    public Revista getRevista() {
        return this.revista;
    }

    
    /** 
     * @param revista
     */
    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    
    /** 
     * @return Articulo
     */
    public Articulo getArticulo() {
        return this.articulo;
    }

    
    /** 
     * @param articulo
     */
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " fechaSolicitud='" + getFechaSolicitud() + "'" +
            ", fechaDevolucion='" + getFechaDevolucion() + "'" +
            ", libro='" + getLibro() + "'" +
            ", revista='" + getRevista() + "'" +
            ", articulo='" + getArticulo() + "'" +
            "}";
    }


}
