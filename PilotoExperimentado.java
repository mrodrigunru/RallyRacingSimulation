
/**
 * Write a description of class PilotoExp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PilotoExperimentado extends Piloto
{
    
    /**
     * Constructor for objects of class PilotoExp
     */
    public PilotoExperimentado(String nombre, Concentracion concentracion)
    {
        super(nombre, concentracion);
    }
    

    @Override
    /**
     * Metodo que calcula la destreza del piloto Experimentado
     * 
     * @param  concentracion: concentracion del piloto
     * @return     (none)
     */
     public double calcularDestreza()
    {
        
        double conc = super.getConcentracion().getValor();
        double dest = ((conc + 3)/130)*1.03;
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
