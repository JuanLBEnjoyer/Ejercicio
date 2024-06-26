package co.edu.uniquindio.poo;

public class Libro {
    
    private String nombre;
    private String autor;
    private String categoria;

    public Libro(String nombre, String autor, String categoria){
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;

        assert !nombre.isEmpty();
        assert !autor.isEmpty();
        assert !categoria.isEmpty();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", autor=" + autor + ", categoria=" + categoria + "]";
    }
    
    
    

    
}
