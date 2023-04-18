package EJ31;

import java.time.LocalDate;
import java.time.Period;

public class Prestamo_Copia {
    Copia_Libro copia;
    Lector lector;
    LocalDate fecha_prestamo;

    boolean cerrado; // Ya se devolvio el libro

    boolean estaVencido(){
        return LocalDate.now().isBefore(fecha_vencimiento()) && !cerrado;
    }

    int diasVencido(){
        return Period.between(fecha_vencimiento(), LocalDate.now()).getDays();
    }

    LocalDate fecha_vencimiento(){
        return fecha_prestamo.plusDays(30);
    } // Se calcula ya que es en base a
                                                                                    // a la fecha inicial

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }


}
