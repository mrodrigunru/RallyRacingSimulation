import java.util.Comparator;
/**
 * Clase abstracta para acceder a los comparadores de pilotos
 * 
 * @author Manuel Rodriguez
 * @version 1.0
 */
public abstract class MegaComparadorPilotos implements Comparator<Piloto>
{
    public abstract int compare(Piloto p1, Piloto p2);
    
}
