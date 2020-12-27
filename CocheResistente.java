
/**
 * Write a description of class CocheResistente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheResistente extends CocheAbstract
{
    int reserva = 100;
    
    /**
     * Constructor for objects of class CocheResistente
     */
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
    }

  
    
    @Override
    public double combustibleRestante(Combustible combustible, int tiempoEnTerminar){
       double cr = 0.0;
       double comb = combustible.getValor();
       
       if (reserva != 0 && tiempoEnTerminar > comb){
           comb = comb + reserva;
           reserva = 0;
        }
        cr = comb - tiempoEnTerminar;
        
       return cr;
    }
}
