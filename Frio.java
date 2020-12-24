
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
    
    }

    @Override
    public double getValorComplejidad(){
        return 1.1*super.getValorComplejidad();
    }
    
    @Override
    public double getValorDistancia(){
        return 0.9*super.getValorDistancia();
    }
}
