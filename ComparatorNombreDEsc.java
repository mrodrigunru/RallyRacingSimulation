import java.util.Comparator;

    /**
     * A comparator of the puntos totales de escuderia
     */
    public class ComparatorNombreDEsc implements Comparator<Escuderia>
    {

        public int compare (Escuderia c1, Escuderia c2){
           
                return (c1.getNombre().compareTo(c2.getNombre()) ) ;
                
        }
    }