
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
        setComplejidadActual(decimals(1.05 * getComplejidadActual(), 2));
        setDistanciaActual(decimals(0.95 * getDistanciaActual(), 2));
    
    }
    
    @Override
    public String getCondiciones(){
        return getDecoratedCircuito().getCondiciones() + getClass().getName();
    }


}
