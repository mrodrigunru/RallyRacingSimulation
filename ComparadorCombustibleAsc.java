import java.util.Comparator;
/**
 * Clase comparadora de ccombustible y nombre de los pilotos 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorCombustibleAsc extends MegaComparadorCoches
{

    /**
     * Comparador de pilotos que compara por combustible y en caso de igualdad por el nombre 
     * 
     * @param  c1   primer coche a comparar
     * @param c2 segundo coche a comparar
     */

    public int compare(Coche c1, Coche c2)
    {
        int i = 0;

        if(c1.getCombustibleActual() == c2.getCombustibleActual()){
            return (c1.getNombre().compareTo(c2.getNombre()) ) ;
            
        }
        else  if (c1.getCombustibleActual() < c2.getCombustibleActual()) i = -1;
        else i = 1;
        return i;
    }
}
