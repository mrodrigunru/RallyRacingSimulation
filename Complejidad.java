
/**
 * Enumeration class Complejidad - Mide la complejidad del cicuito
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public enum Complejidad
{
    BAJA ("BAJA",1.0),
    MEDIA ("MEDIA",1.25),
    ALTA ("ALTA",1.5);
    
    private final String nombre;
    private final double value;
    
    /**
     * Constructor del enum complejidad
     */
    Complejidad(String nombre, double value){
        this.nombre=nombre;
        this.value=value;
    }
    
    /**
     * Metodo que devuelve el nombre del enum
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo que devuelve el valor del  enum
     */
    public double getValor(){
        return value;  
    }
    
    /*@Override
    public String toString(){
        return getNombre() + "(Valor Original: "+ getValor() +")";
    }*/
}
