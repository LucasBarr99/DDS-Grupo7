package EJ29;

import java.util.List;

public class Carrito_Compras {
  List<Item_Producto> items;

  void agregarItem(Item_Producto item){
    items.add(item);
  }
  void quitarItem(Item_Producto item){
    items.remove(item);
  }

  double precioFinal(){
    return items.stream().mapToDouble(item_producto -> item_producto.getPrecio()).sum();
  }
  void confirmarCompra(Cliente cliente){
    if(cliente.getMedioDePago().estaHabilitado(this)) {
      cliente.getMedioDePago().pagar(this);
    }
    new IllegalStateException("El medio de pago no se encuentra habilitado!");

  }
}
