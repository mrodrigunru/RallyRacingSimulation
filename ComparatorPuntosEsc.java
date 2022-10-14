import java.util.Comparator;

/**
 * A comparator of the puntos totales de escuderia
 */
public class ComparatorPuntosEsc implements Comparator<Escuderia>
{

    public int compare (Escuderia c1, Escuderia c2){
        int i =0;

        if(c1.totalPuntosEscuderia() == c2.totalPuntosEscuderia()){
            return (c1.getNombre().compareTo(c2.getNombre()) ) ;

        }
        else if (c1.totalPuntosEscuderia() < c2.totalPuntosEscuderia()) i = 1;
        else  i = -1;
        return i;
    }
}