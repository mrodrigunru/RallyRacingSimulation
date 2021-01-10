
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
        setComplejidadActual(decimals(1.1 * getComplejidadActual(), 2));
        setDistanciaActual(decimals(0.9 * getComplejidadActual(), 2));
    
    }
    
    @Override
    public String getCondiciones(){
        return getDecoratedCircuito().getCondiciones() + getClass().getName();
    }

}
