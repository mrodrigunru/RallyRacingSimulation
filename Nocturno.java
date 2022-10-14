
/**
 * Write a description of class Nocturno here.
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public class Nocturno extends CircuitoDecorator
{
    
    /**
     * Constructor for objects of class Nocturno
     */
    public Nocturno(String nombre, Complejidad comp, Distancia dis, Circuito circuito)
    {
        super(nombre, comp, dis, circuito);
        
        setComplejidadActual(Math.round((1.2 * getComplejidadActual())*100d) / 100d);
        
        setDistanciaActual(Math.round((0.8 * getDistanciaActual())*100d) / 100d);
    }
    
    
    
}
