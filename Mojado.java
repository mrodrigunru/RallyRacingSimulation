
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
    
    }

    @Override
    public double getValorComplejidad(){
        return 1.15*super.getValorComplejidad();
    }
    
    @Override
    public double getValorDistancia(){
        return 0.85*super.getValorDistancia();
    }
}
