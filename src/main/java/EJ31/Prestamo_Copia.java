package EJ31;

import java.time.LocalDate;

public class Prestamo_Copia {
    Copia_Libro copia;
    Lector lector;
    LocalDate fecha_prestamo;
    LocalDate fecha_vencimiento;

    Boolean estaVencido(){
        LocalDate hoy = LocalDate.now();
        int comparacion = fecha_vencimiento.compareTo(hoy);
        return comparacion > 0;
    }


}
