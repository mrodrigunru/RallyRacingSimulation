import java.util.Comparator;
/**
     * A comparator of Circuitos por complejidad de forma descendente
     */
    public class ComparatorComplejidadDesc extends MegaComparadorCircuitos
    {

        public int compare (Circuito c1, Circuito c2){
            int i =0;
            if (c1.getComplejidadActual() > c2.getComplejidadActual()) i = 1;
            if (c1.getComplejidadActual() < c2.getComplejidadActual()) i = -1;
            else {
             if (c1.getNombre().compareTo(c2.getNombre()) < 0) i = -1;
                   else if (c1.getNombre().compareTo(c2.getNombre()) > 0) i = 1;
               }
            return i;
        }
        
    }
    