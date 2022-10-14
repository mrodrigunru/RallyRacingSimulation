/**
 * Enumeration class Velocidad - mide la velocidad de un coche
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public enum Velocidad
{
    TORTUGA ("TORTUGA",200.0),
    LENTA ("LENTA",210.0),
    NORMAL ("NORMAL",220.0),
    RAPIDA ("RAPIDA",230.0),
    GUEPARDO ("GUEPARDO",240.0);
    
    private final String nombre;
    private final double value;
    
    /**
     * Constructor de la clase Enum velocidad
     * 
     * @param String nombre : etiqueta del enumerado
     * @param double value : valor del enumerado
     * 
     * @return (none)
     */
    Velocidad(String nombre, double value){
        this.nombre=nombre;
        this.value=value;
    }
    
    /**
     * Metodo getter de la etiqueta del enumerado
     * @param (none)
     * 
     * @return String nombre : el nombre del enumerado
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo getter del valor del enumerado
     * 
     * @param (none)
     * 
     * @return double value : el valor del enumerado
     */
    public double getValor(){
        return value;  
    }
}
    
    
