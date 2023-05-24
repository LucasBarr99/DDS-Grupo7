package EJ31;

import java.time.LocalDate;

public class MultaController {

    public void gestionarDevolucion(Prestamo_Copia prestamo,Lector lector){
        prestamo.cerrar();

        if(prestamo.estaVencido() && !lector.tienePrestamosVencidos() && !lector.tieneMultasVigentes()){
            Integer diasVencido = prestamo.diasVencido();
            Integer diasMulta = calcularDiasMulta(diasVencido);
            Multa multa = generarMulta(diasMulta);
            lector.agregarMulta(multa);
        }
    }

    private Multa generarMulta(Integer diasMulta) {
        return new Multa(LocalDate.now(),diasMulta);
    }

    private Integer calcularDiasMulta(Integer diasVencido) {
        return diasVencido * 2;
    }
}
