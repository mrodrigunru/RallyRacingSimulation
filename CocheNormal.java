
/**
 * Write a description of class CocheNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheNormal extends CocheAbstract
{
    

    /**
     * Constructor for objects of class CocheNormal
     */
    public CocheNormal(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
    }

    public String getTipo(){
        return getClass().getName();
    }
    
    @Override
    public String toString(){
        return "<coche:" +getNombre() + "> <tipo:" + getTipo() + "> <vel_teó:" +  getVelocidad() +
         "(" + getValorVelocidad() + ")> <comb: "+ getCombustible() + "(" + getValorCombustible() + ") (actual:" + getCombustibleActual() +
         ")>";
    }
}
