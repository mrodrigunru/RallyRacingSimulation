
/**
 * Write a description of class CocheResistente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheResistente extends CocheAbstract
{
    
    /**
     * Constructor for objects of class CocheResistente
     */
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    @Override
    public double getValorCombustible(){
        return super.getValorCombustible() + 100;
    }
    
    @Override
    public double combustibleRestante(Combustible combustible, int tiempoEnTerminar){
       double cr = 0.0;
       //falta implementar
       return cr;
    }
}
