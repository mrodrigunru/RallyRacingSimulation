
/**
 * Write a description of class Frio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frio extends CircuitoDecorator
{
    /**
     * Constructor for objects of class Nocturno
     */
    public Frio(String nombre, Complejidad comp, Distancia dis, Circuito circuito)
    {
        super(nombre, comp, dis, circuito);
        setComplejidadActual(1.1 * getComplejidadActual());
        setDistanciaActual(0.9 * getDistanciaActual());
    
    }
    
    @Override
    public String getCondiciones(){
        return getDecoratedCircuito().getCondiciones() + getClass().getName();
    }

}
