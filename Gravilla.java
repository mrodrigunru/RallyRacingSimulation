
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
    
    }

    @Override
    public double getValorComplejidad(){
        return 1.05*super.getValorComplejidad();
    }
    
    @Override
    public double getValorDistancia(){
        return 0.95*super.getValorDistancia();
    }
}
