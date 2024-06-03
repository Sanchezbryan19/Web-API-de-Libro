package libros.com.tuuniversidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libros.com.tuuniversidad.models.Libro;
import libros.com.tuuniversidad.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro getLibro(int id) {
        return libroRepository.getLibro(id);
    }

    @Override
    public List<Libro> getLibros() {
        return libroRepository.getLibros();
    }

    @Override
    public void postLibro(Libro libro) {
        libroRepository.postLibro(libro);
    }
    
}
