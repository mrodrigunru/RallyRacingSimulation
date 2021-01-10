
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
        setComplejidadActual(decimals(1.2 * getComplejidadActual(), 2));
        setDistanciaActual(decimals(0.8 * getDistanciaActual(), 2));
    }
    
    @Override
    public String getCondiciones(){
        return getDecoratedCircuito().getCondiciones() + getClass().getName();
    }

    
}
