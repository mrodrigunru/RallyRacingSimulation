import java.util.Comparator;
/**
 * Clase abstracta para acceder a los comparadores de pilotos
 * 
 * @author Manuel Rodriguez
 * @version 1.0
 */
public abstract class MegaComparadorCircuitos implements Comparator<Circuito>
{
    public abstract int compare(Circuito c1, Circuito c2);
    
}
