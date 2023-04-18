package EJ31;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Multa {

    LocalDate fecha_inicio;
    Integer cantidadDeDias;

    Boolean estaVigente(){
        return LocalDate.now().isAfter(fecha_inicio.plusDays(cantidadDeDias));
    }

    public Multa(LocalDate fecha_inicio, Integer cantidadDeDias) {
        this.fecha_inicio = fecha_inicio;
        this.cantidadDeDias = cantidadDeDias;
    }
}
