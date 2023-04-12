package EJ29;

public class Item_Producto {
  Producto producto;
  int cantidad;


  double getPrecio(){
    return cantidad * producto.getPrecio();
  }
}
