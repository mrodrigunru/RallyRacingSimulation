
/**
 * Write a description of class Gravilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gravilla extends CircuitoDecorator
{
    /**
     * Constructor for objects of class Nocturno
     */
    public Gravilla(String nombre, Complejidad comp, Distancia dis, Circuito circuito)
    {
        super(nombre, comp, dis, circuito);
     
        setComplejidadActual(Math.round((1.05 * getComplejidadActual())*100d) / 100d);
        
        setDistanciaActual(Math.round((0.95 * getDistanciaActual())*100d) / 100d);
    }
    
    

}
