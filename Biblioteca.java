import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Revista> revistas;
    private ArrayList<Articulo> articulos;
    private ArrayList<Cliente> clientes;


    public Biblioteca() {
        libros = new ArrayList<Libro>();
        revistas = new ArrayList<Revista>();
        articulos = new ArrayList<Articulo>();
        clientes = new ArrayList<Cliente>();
    }

    
    /** 
     * Agrega la publicación a su respectiva lista dependiendo del tipo de publicación
     * @param tipoPublicacion: 1: libro, 2: revista,  3: articulo
     * @param id: entero de 6 dígitos, identificador único de la publicación
     * @param titulo: Título de la publicación
     * @param materia: Materia a la que pertenece, Ej. Matemática, Física, etc
     * @param cantEjemplares: Cantidad de ejemplares de una publicación que hay en la biblioteca
     * @param estado: disponible o agotado
     * @param editorial: Editorial que publicó el libro
     * @param autor: Autor del libro o del artículo
     * @param numero: Número de la revista
     * @param anio: Año de la revista 
     * @param arbitro: Árbitro revisor del artículo
     */
    public void insertarPublicacion(int tipoPublicacion, int id, String titulo, String materia, int cantEjemplares, String estado,
    String editorial, String autor,int numero, int anio,String arbitro){
        //1: libro, 2: revista,  3: articulo
        switch (tipoPublicacion) {
            case 1:
                Libro miLibro = new Libro(id,titulo,materia,cantEjemplares,estado,editorial,autor);
                libros.add(miLibro);
                break;
            case 2:
                Revista miRevista = new Revista(id, titulo, materia, cantEjemplares, estado, numero, anio);
                revistas.add(miRevista);
                break;
            case 3:
                Articulo miArticulo = new Articulo(id, titulo, materia, cantEjemplares, estado, arbitro, autor);
                articulos.add(miArticulo);
                break;
        }

    }

    public Cliente buscarCliente(long dpi){
        Cliente clienteEncontrado = null;
        boolean loEncontre = false;
        int i = 0;
        while (loEncontre == false &&  i<clientes.size()){
            if (clientes.get(i).getDpi() == dpi){
                loEncontre = true;
                clienteEncontrado = clientes.get(i);
            }

            i++;
        }
        return clienteEncontrado;
    }

    public Libro buscarLibro(int id){
        Libro libroEncontrado = null;
        boolean loEncontre = false;
        int i = 0;
        while (i<libros.size() && loEncontre == false){
            if (libros.get(i).getId() == id){
                loEncontre = true;
                libroEncontrado = libros.get(i);
            }
            i++;
        }
        return libroEncontrado;
    }
    public Revista buscarRevista(int id){
        Revista revistaEncontrada = null;
        boolean loEncontre = false;
        int i = 0;
        while (i<revistas.size() && loEncontre == false){
            if (revistas.get(i).getId() == id){
                loEncontre = true;
                revistaEncontrada = revistas.get(i);
            }
            i++;
        }
        return revistaEncontrada;
    }
    public Articulo buscarArticulo(int id){
        Articulo articuloEncontrado = null;
        boolean loEncontre = false;
        int i = 0;
        while (i<articulos.size() && loEncontre == false){
            if (articulos.get(i).getId() == id){
                loEncontre = true;
                articuloEncontrado = articulos.get(i);
            }
            i++;
        }
        return articuloEncontrado;
    }

    //d) Realizar un préstamo de un documento. 
    public void realizarPrestamo(long dpi, int idPublicacion,int cantDias, int tipoPublicacion){
        Cliente cliente = buscarCliente(dpi);
        Libro libro = null;
        Revista revista = null;
        Articulo articulo = null;
        Prestamo prestamo;
        if (tipoPublicacion == 1){
            libro = buscarLibro(idPublicacion);
            prestamo = new Prestamo(tipoPublicacion, libro, null, null, cantDias);
            
        }
        if (tipoPublicacion == 2){
            revista = buscarRevista(idPublicacion);
        }
        if (tipoPublicacion == 3){
            articulo = buscarArticulo(idPublicacion);
        }

    }
    /*
    
b) Devolver el título de una publicación cualquiera, dado su Id. 
c) Calcular la cantidad de documentos de una materia dada. 
d) Realizar un préstamo de un documento. 
e) Realizar la devolución de un documento. 
f) Conocer la cantidad de documentos de cada tipo que se le ha prestado a un cliente. 
g) Determinar la cantidad de revistas de una materia dada que posee la biblioteca. 
h) Dado un libro o un artículo determinar si quedan ejemplares disponibles en la biblioteca.  */
    
}
