
/**
 * Write a description of class Factura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Vector;

public class Factura
{
    // instance variables - replace the example below with your own
    private String empresa;
    private String cliente;
    private static int num;
    private Vector articulos;
    private int folio;
    
    // Constructores
    public Factura(String cliente) {
        this.empresa = new String("Papeleria Pony");
        this.cliente = new String(cliente);
        this.folio = ++num;
        this.articulos = new Vector(10,5);
    }
    
    public int getNumeroArticulos() {
        return articulos.size();
    }
    
    public void agregaArtículo(Articulo articulo) {
        articulos.add(articulo);
    }
    
    public void setArticulo(int index, Articulo articulo) {
        articulos.set(index, articulo);
    }
    
    public Object getArticulo(int index) {
        return articulos.get(index);
    }
    
    public double calculaTotalArtículos() {
        double sum = 0.0;
        for(Articulo recorre : articulos) {
            sum += recorre.importe();
        }
        return sum;
    }
}








