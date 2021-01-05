import java.util.Comparator;

    /**
     * A comparator of Circuitos por complejidad de forma descendente
     */
    public class ComparatorDistanciaDesc extends MegaComparadorCircuitos
    {

        public int compare (Circuito c1, Circuito c2){
            int i =0;
            if (c1.getDistanciaActual() > c2.getDistanciaActual()) i = -1;
            if (c1.getDistanciaActual() < c2.getDistanciaActual()) i = 1;
            return i;
        }
        
    }
    
    
