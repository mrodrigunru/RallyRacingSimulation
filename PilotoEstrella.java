
/**
 * Write a description of class PilotoEstrella here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PilotoEstrella extends Piloto
{
    
    /**
     * Constructor for objects of class PilotoEstrella
     */
    public PilotoEstrella(String nombre, Concentracion concentracion)
    {
        super(nombre, concentracion);
    }
    

    @Override
    /**
     * Metodo que calcula la destreza del piloto Estrella
     * 
     * @param  concentracion: concentracion del piloto
     * @return     (none)
     */
     public double calcularDestreza()
    {
        
        double conc = super.getConcentracion().getValor();
        double dest = (((conc + 6)/140)*1.06)+0.05;
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
