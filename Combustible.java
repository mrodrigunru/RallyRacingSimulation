
/**
 * Enumeration class Combustible - mide el combustible de un coche
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public enum Combustible
{
    ESCASO ("ESCASO",350.0),
    NORMAL ("NORMAL",440.0),
    GENEROSO ("GENEROSO",460.0),
    ELEFANTE ("ELEFANTE",480.0);
    
    private final String nombre;
    private final double value;
    
    Combustible(String nombre, double value){
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
