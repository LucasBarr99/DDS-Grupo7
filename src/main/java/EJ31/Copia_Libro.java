package EJ31;

public class Copia_Libro {
    int id;
    Libro libro;
    Estado_Copia estado;

    public Copia_Libro(int id, Libro libro, Estado_Copia estado) {
        this.id = id;
        this.libro = libro;
        this.estado = estado;
    }
}
