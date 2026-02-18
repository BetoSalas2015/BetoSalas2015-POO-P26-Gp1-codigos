
/**
 * Write a description of class Articulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Articulo
{
    // instance variables - replace the example below with your own
      private int cantidad;
      private double precio;
      private String descripcion;
      
      public Articulo(int cantidad, String descripcion, double precio) {
          this.descripcion = new String(descripcion);
          this.precio = precio;
          this.cantidad = cantidad;
      }
      
      public double importe() {
          return precio * cantidad;
      }
}



