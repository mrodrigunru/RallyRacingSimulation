import java.util.Comparator;
/**
 * Clase comparadora de carreras terminadas y nombre de los pilotos asc
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorDestrezaAsc extends MegaComparadorPilotos
{
    
    /**
     * Comparador de pilotos que compara por total de carreras terminadas y en caso de igualdad por el nombre 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public int compare(Piloto p1, Piloto p2)
    {
        int i = 0;
        if (p1.getCarrerasTerminadas() == p2.getCarrerasTerminadas()){
             if (p1.getNombre().compareTo(p2.getNombre()) < 0) i = -1;
                   else if (p1.getNombre().compareTo(p2.getNombre()) > 0) i = 1;
               }
        else if (p1.getCarrerasTerminadas() > p2.getCarrerasTerminadas())
        i= 1;
        else i= -1;
        return i;
    }
}
