import java.util.Comparator;
/**
 * Clase abstracta para acceder a los comparadores de pilotos
 * 
 * @author Manuel Rodriguez
 * @version 1.0
 */
public abstract class MegaComparadorCoches implements Comparator<Coche>
{
    public abstract int compare(Coche c1, Coche c2);
    
}
