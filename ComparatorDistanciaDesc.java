import java.util.Comparator;

    /**
     * A comparator of Circuitos por Distancia Actual de forma descendente
     */
    public class ComparatorDistanciaDesc extends MegaComparadorCircuitos
    {

        public int compare (Circuito c1, Circuito c2){
            int i =0;
            if (c1.getDistanciaActual() > c2.getDistanciaActual()) i = -1;
            if (c1.getDistanciaActual() < c2.getDistanciaActual()) i = 1;
            else {
             return (c2.getNombre().compareTo(c1.getNombre())) ;
                  
               }
            return i;
        }
        
    }
    
    
