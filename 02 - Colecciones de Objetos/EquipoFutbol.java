
/**
 * Write a description of class EquipoFutbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EquipoFutbol
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String entrenador;
    private String equipo[];
    
    // Constructores
    public EquipoFutbol(String nombre, String entrenador) {
        this.nombre = new String(nombre);
        this.entrenador = new String(entrenador);
        this.equipo = new String[11];
    }
    
    public String getNombre() {
        return new String(this.nombre);
    }
    
    public String getEntrenador() {
        return new String(entrenador);
    }
    
    public void setEntrenador(String nuevoEntrenador) {
        entrenador = new String(nuevoEntrenador);
    }
    
    public void agregaJugador(int index, String nombre) {
        if(index >= 1 && index <= 11) 
            equipo[index - 1] = new String(nombre);
    }
    
    public String getJugador(int index) {
        if((index >= 1 && index <= 11) && (equipo[index -1] != null))
            return new String(equipo[index -1]);
        else
            return null;
    }
    
    public static void main(String args[]) {
        EquipoFutbol equipoFu1 = new EquipoFutbol("Los Mazacotes de Chicontepc", "Horacio Cascarín");
        System.out.println( equipoFu1.getNombre() );
        System.out.println( equipoFu1.getEntrenador() );
        equipoFu1.setEntrenador("Horacio");
        System.out.println( equipoFu1.getEntrenador() );
        equipoFu1.agregaJugador(3, "El Jalapeño");
        System.out.println( equipoFu1.getJugador(7) );      // null
        System.out.println( equipoFu1.getJugador(3) );
        
    }
    
}








