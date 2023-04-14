package EJ31;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    String nombre;
    List<Prestamo_Copia> prestamos = new ArrayList<Prestamo_Copia>();
    List<Multa> multas= new ArrayList<Multa>();

    void agregarMulta(Multa multa){
        this.multas.add(multa);
    }

    Integer getCantidadDePrestamos(){
        return this.prestamos.size();
    }

    Boolean tienePrestamosVencidos(){
        return this.prestamos.stream().anyMatch(Prestamo_Copia::estaVencido);
    }

    Boolean tieneMultasVigentes(){
        return this.multas.stream().anyMatch(Multa::estaVigente);
    }



}
