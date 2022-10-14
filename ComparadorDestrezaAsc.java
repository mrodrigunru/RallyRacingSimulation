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
     * @param  p1   primer piloto
     * @param  p2   segundo piloto
     */

    public int compare(Piloto p1, Piloto p2)
    {
        int i = 0;
        if (p1.calcularDestreza() == p2.calcularDestreza()){
            return (p1.getNombre().compareTo(p2.getNombre()) ) ;

        }
        else if (p1.calcularDestreza() > p2.calcularDestreza())
            i= 1;
        else i= -1;
        return i;
    }
}
