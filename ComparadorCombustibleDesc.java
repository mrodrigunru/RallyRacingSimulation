import java.util.Comparator;
/**
 * Clase comparadora de carreras terminadas y nombre de los pilotos asc
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorCombustibleDesc extends MegaComparadorCoches
{
    
    /**
     * Comparador de pilotos que compara por total de carreras terminadas y en caso de igualdad por el nombre 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public int compare(Coche c1, Coche c2)
    {
        int i = 0;
        if (c1.getCombustibleActual() < c2.getCombustibleActual()) i = 1;
        if (c1.getCombustibleActual() > c2.getCombustibleActual()) i = -1;
        if(c1.getCombustibleActual() == c2.getCombustibleActual()){
                if (c1.getNombre().compareTo(c2.getNombre()) < 0) i = 1;
                if (c1.getNombre().compareTo(c2.getNombre()) > 0) i = -1;
            }
        return i;
    }
}
