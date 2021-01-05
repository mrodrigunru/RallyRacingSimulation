
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
   
        setComplejidadActual(1.15 * getComplejidadActual());
        setDistanciaActual(0.85 * getDistanciaActual());
    }
    
    @Override
    public String getCondiciones(){
        return getDecoratedCircuito().getCondiciones() + getClass().getName();
    }

}
