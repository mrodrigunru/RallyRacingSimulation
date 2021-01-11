
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
   
        setComplejidadActual(decimals(1.15 * getComplejidadActual(), 2));
        setDistanciaActual(decimals(0.85 * getDistanciaActual(), 2));
    }
    
    @Override
    public String getCondiciones(){
        return getDecoratedCircuito().getCondiciones() + getClass().getName();
    }

}
