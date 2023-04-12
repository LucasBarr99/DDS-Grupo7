package EJ29;

import java.util.List;

public class Cliente {
  String nombre;
  String direccion_envio;
  String direccion_cobro;
  String email;
  List<Carrito_Compras> carritos;
  List<Carrito_Compras> comprasConfirmadas;
  MedioDePago medioDePago;
  double porcentaje_descuento;

  public double porcentaje_descuento() {
    return porcentaje_descuento;
  }

  public MedioDePago getMedioDePago() {
    return medioDePago;
  }

  void agregarCompra(Carrito_Compras carrito){ // Agrega la compra confirmada para tener un historial
    carritos.remove(carrito);
    comprasConfirmadas.add(carrito);
  }
}
