import java.util.Comparator;
/**
 * Clase comparadora de 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorDestrezaDesc extends MegaComparadorPilotos
{
    
    /**
     * Comparador de pilotos que compara por 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public int compare(Piloto p1, Piloto p2)
    {
        int i = 0;
        if (p1.calcularDestreza() == p2.calcularDestreza()){
             return (p1.getNombre().compareTo(p2.getNombre()));
                 
               }
        else if (p1.calcularDestreza() > p2.calcularDestreza())
        i= -1;
        else i= 1;
        
        return i;
    }
}
