package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args){
        System.out.println("-----------------------");
        Libro libro1 = new Libro("1234", "Pablo", "Comedia");
        Libro libro2 = new Libro("456", "Pedro", "Terror");
        Libro libro3 = new Libro("789", "Mario", "Romance");
        Collection<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        FachadaBiblioteca fachada1  = new FachadaBiblioteca(libros);

        Collection<Libro> buscar1 = fachada1.buscarPorTitulo("1234");

        System.out.println(buscar1.toString());

    }
    
}
