/**
 * Enumeration class Distancia - Mide la distancia del cicuito
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public enum Distancia
{
    CORTA ("CORTA",250.0),
    INTERMEDIA ("INTERMEDIA",275.0),
    LARGA ("LARGA",300.0);
    
    private final String nombre;
    private final double value;
    
    /**
     * Constructor de la clase enum de distancia
     */
    Distancia(String nombre, double value){
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
     * Metodo que devuelve el valor del enum
     */
    public double getValor(){
        return value;  
    }
    
    
    /*@Override
    public String toString(){
        return getNombre() + "(Valor Original: "+ getValor() +")";
    }*/
}
