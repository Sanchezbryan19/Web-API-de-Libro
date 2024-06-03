package libros.com.tuuniversidad.repository;

import java.util.List;

import libros.com.tuuniversidad.models.Libro;

public interface LibroRepository {

    Libro getLibro(int id);
    List<Libro> getLibros();
    void postLibro(Libro libro);

}
