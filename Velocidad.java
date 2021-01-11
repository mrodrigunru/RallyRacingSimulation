/**
 * Enumeration class Velocidad - mide el combustible de un coche
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
    
    Velocidad(String nombre, double value){
        this.nombre=nombre;
        this.value=value;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getValor(){
        return value;  
    }
}
    
    
