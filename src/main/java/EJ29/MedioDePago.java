package EJ29;

public class MedioDePago {
  Cliente cliente;
  double limiteCredito;

  boolean habilitado;


  boolean estaHabilitado(Carrito_Compras carrito){
    return (limiteCredito >= carrito.precioFinal()) && habilitado;
  }

  void pagar(Carrito_Compras carrito_compras){
    if(cliente.porcentaje_descuento()> 0){
      limiteCredito = limiteCredito - carrito_compras.precioFinal()*cliente.porcentaje_descuento();
    }
    limiteCredito = limiteCredito - carrito_compras.precioFinal();

  }
}
