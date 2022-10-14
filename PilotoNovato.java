
/**
 * Write a description of class PilotoNovato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PilotoNovato extends Piloto
{
   
    /**
     * Constructor for objects of class PilotoNovato
     */
    public PilotoNovato(String nombre, Concentracion concentracion)
    {
        super(nombre, concentracion);
    }

    @Override
    /**
     * Metodo que calcula la destreza del piloto novato
     * 
     * @param  concentracion: concentracion del piloto
     * @return     (none)
     */
     public double calcularDestreza()
    {
        
        double conc = super.getConcentracion().getValor();
        double dest = ((conc * 0.97)/120)-0.03;
        dest = Math.round((dest)*100d) / 100d;
        return dest;
        
    }
    
    /**
     * Metodo que devuelve las caracterisitcas del piloto
     */
    public String getTipoPiloto(){
     return getClass().getName();  
    }
}
