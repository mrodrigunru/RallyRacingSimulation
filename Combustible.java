
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
    
    /**
     * Constructor de la clase Enum combustible
     * 
     * @param String nombre : etiqueta del enumerado
     * @param double value : valor del enumerado
     * 
     * @return (none)
     */
    Combustible(String nombre, double value){
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
