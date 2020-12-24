
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
    
    }

    @Override
    public double getValorComplejidad(){
        return 1.2*super.getValorComplejidad();
    }
    
    @Override
    public double getValorDistancia(){
        return 0.8*super.getValorDistancia();
    }
}
