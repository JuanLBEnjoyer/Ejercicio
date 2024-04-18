package co.edu.uniquindio.poo;
import java.util.Collection;

public class FachadaBiblioteca {

    private BuscadorLibros buscador;

    public FachadaBiblioteca(Collection<Libro> libros){

        this.buscador = new BuscadorLibros(libros);

    }


    public Collection<Libro> buscarPorTitulo(String nombre){
        return buscador.buscarPorTitulo(nombre);
    }

    public Collection<Libro> buscarPorAutor(String autor){
        return buscador.buscarPorAutor(autor);
    }

    public Collection<Libro> buscarPorCategoria(String categoria){
        return buscador.buscarPorCategoria(categoria);
    }
    
}
