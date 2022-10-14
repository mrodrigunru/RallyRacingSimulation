
/**
 * Write a description of class Mojado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mojado extends CircuitoDecorator
{
   /**
     * Constructor for objects of class Nocturno
     */
    public Mojado(String nombre, Complejidad comp, Distancia dis, Circuito circuito)
    {
        super(nombre, comp, dis, circuito);
   
        setComplejidadActual(Math.round((1.15 * getComplejidadActual())*100d) / 100d);
        
        setDistanciaActual(Math.round((0.85 * getDistanciaActual())*100d) / 100d);
    }
    
    
}
