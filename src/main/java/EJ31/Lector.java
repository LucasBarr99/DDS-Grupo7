package EJ31;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lector {
    String nombre;
    List<Prestamo_Copia> prestamos = new ArrayList<Prestamo_Copia>();
    List<Multa> multas= new ArrayList<Multa>();

    void agregarMulta(Multa multa){
        this.multas.add(multa);
    }

    boolean puedePedirPrestamo(){
        return prestamosActuales() < 3 && !tienePrestamosVencidos() && !tieneMultasVigentes();
    }

    Boolean tienePrestamosVencidos(){
        return this.prestamos.stream().anyMatch(Prestamo_Copia::estaVencido);
    }

    Boolean tieneMultasVigentes(){
        return this.multas.stream().anyMatch(Multa::estaVigente);
    }

    void agregarMulta(int dias){
        multas.add(new Multa(LocalDate.now(), dias));
    }

    int prestamosActuales(){
        return prestamos.stream().filter(prestamo_copia -> !prestamo_copia.estaCerrado()).collect(Collectors.toList()).size();
    }

    void hayCopiasDeLibro(Libro libro){

    }
    void pedirPrestamo(Libro libro){
        if(puedePedirPrestamo()){
            // Se le pide al repo una copia del libro
        }
    }


}
