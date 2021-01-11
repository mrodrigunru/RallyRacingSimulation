/**
 * Enumeration class Concentracion - mide la concentracion de un  piloto
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public enum Concentracion
{
    DESPISTADO ("DESPISTADO",90.0),
    NORMAL ("NORMAL",100.0),
    CONCENTRADO ("CONCENTRADO",110.0),
    ZEN ("ZEN",120.0);
    
    private final String nombre;
    private final double value;
    
    Concentracion(String nombre, double value){
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
