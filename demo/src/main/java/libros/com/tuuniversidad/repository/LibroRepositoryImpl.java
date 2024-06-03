package libros.com.tuuniversidad.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import libros.com.tuuniversidad.models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1L, "Cien años de soledad", "Gabriel García Márquez", "Harper & Row", 1967));
        libros.add(new Libro(2L, "Orgullo y prejuicio", "Jane Austen", "T. Egerton", 1813));
        libros.add(new Libro(3L, "Matar a un ruiseñor", "Harper Lee", "J.B. Lippincott & Co.", 1960));
    }

    public Libro getLibro (int id){
        for(Libro libro: libros){
            if(id == libro.getId())
                return libro;
        }

        return null;
        
    }

    public List<Libro> getLibros() {
        return libros;
    }


    public void postLibro(Libro libro) {
        libros.add(libro);
    }
}
