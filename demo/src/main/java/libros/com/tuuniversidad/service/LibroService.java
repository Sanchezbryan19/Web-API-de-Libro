package libros.com.tuuniversidad.service;

import java.util.List;

import libros.com.tuuniversidad.models.Libro;

public interface LibroService {

    Libro getLibro (int id);
    List<Libro> getLibros();
    void postLibro(Libro libro);
    
}
