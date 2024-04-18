package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.function.Predicate;

public class BuscadorLibros {

    Collection<Libro> libros;
    
    public BuscadorLibros(Collection<Libro> libros){
        this.libros = libros;
        assert libros != null;
    }


    public Collection<Libro> buscarPorTitulo(String titulo){
        Predicate<Libro> condicion = l ->l.getNombre().equals(titulo);
        return libros.stream().filter(condicion).toList(); 
    }

    public Collection<Libro> buscarPorAutor(String autor){
        Predicate<Libro> condicion = l ->l.getAutor().equals(autor);
        return libros.stream().filter(condicion).toList(); 
    }

    public Collection<Libro> buscarPorCategoria(String categoria){
        Predicate<Libro> condicion = l ->l.getCategoria().equals(categoria);
        return libros.stream().filter(condicion).toList(); 
    }




    
}
