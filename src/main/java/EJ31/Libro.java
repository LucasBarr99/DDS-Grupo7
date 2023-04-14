package EJ31;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    String nombre;
    int año;
    List<Autor> autores = new ArrayList<Autor>();
    List<Copia_Libro> copias = new ArrayList<Copia_Libro>();
    Categoria categoria;
    String editorial;

}
