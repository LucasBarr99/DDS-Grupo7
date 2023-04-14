package EJ31;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Multa {

    LocalDate fecha_inicio;
    Integer cantidadDeDias;

    Boolean estaVigente(){
        LocalDate hoy = LocalDate.now();
        Long diferenciaDias = DAYS.between(this.fecha_inicio,hoy);
        return this.cantidadDeDias > diferenciaDias;
    }

}
