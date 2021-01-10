import java.util.Comparator;
/**
 * Clase comparadora de puntos totales de pilotos
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorPuntosCarrerasAsc  extends MegaComparadorPilotos
{
    

    /**
     * Comparador de pilotos que compara por total de puntos obtenidos de forma ascente y en caso de igualdad por el numero de carreras terminadas
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public int compare(Piloto p1, Piloto p2)
    {
        if (p1.getPuntosAcumulados() == p2.getPuntosAcumulados())
        return new ComparadorDestrezaAsc().compare(p1,p2);
        else if (p1.getPuntosAcumulados() > p2.getPuntosAcumulados())
        return 1;
        else return -1;
    }
}

