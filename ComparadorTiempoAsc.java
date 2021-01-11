import java.util.Comparator;
/**
 * Clase comparadora de tiempo en carreras
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorTiempoAsc extends MegaComparadorPilotos
{
    private Circuito circ;
    
    public ComparadorTiempoAsc(Circuito circ){
        this.circ = circ;
    }
    
    
    /**
     * Comparador de pilotos que compara por total de carreras terminadas y en caso de igualdad por el nombre 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public int compare(Piloto p1, Piloto p2)
    {
        int i = 0;
        if (p1.getTiempoEnCircuito(circ.getNombre()) == p2.getTiempoEnCircuito(circ.getNombre())){
             if (p1.getNombre().compareTo(p2.getNombre()) < 0) i = -1;
                   else if (p1.getNombre().compareTo(p2.getNombre()) > 0) i = 1;
               }
        else if (p1.getTiempoEnCircuito(circ.getNombre()) > p2.getTiempoEnCircuito(circ.getNombre()))
        i= 1;
        else i= -1;
        return i;
    }
    
    
}
