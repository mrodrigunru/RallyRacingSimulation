
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

    /**
     * Metodo que devuelve el tipo de coche 
     * 
     * @return String tipo: tipo de coche
     */
    public String getTipo(){
        return getClass().getName();
    }
    
    /**
     * Método que imprime las caracteristicas del Coche
     */
    @Override
    public String toString(){
        return "<coche:" +getNombre() + "> <tipo:" + getTipo() + "> <vel_teó:" +  getVelocidad() +
         "(" + getValorVelocidad() + ")> <comb: "+ getCombustible() + "(" + getValorCombustible() + ") (actual:" + getCombustibleActual() +
         ")>";
    }
}
