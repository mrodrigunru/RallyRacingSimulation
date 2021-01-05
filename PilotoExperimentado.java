
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
        double dest = 0.0;
        double conc = super.getConcentracion().getValor();
        dest = conc + 3;
        dest = dest / 130;
        dest = dest * 1.03;
        
        return dest;
        
    }
    
    public String getTipoPiloto(){
     return getClass().getName();  
    }
}
