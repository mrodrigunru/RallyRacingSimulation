
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
        setComplejidadActual(1.05 * getComplejidadActual());
        setDistanciaActual(0.95 * getDistanciaActual());
    
    }
    
    @Override
    public String getCondiciones(){
        return getDecoratedCircuito().getCondiciones() + getClass().getName();
    }


}
