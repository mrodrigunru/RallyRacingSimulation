
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
     public void calcularDestreza()
    {
        double dest = 0.0;
        double conc = super.getConcentracion().getValor();
        dest = conc + 6;
        dest = dest / 140;
        dest = dest * 1.06;
        dest = dest + 0.05;
        
        super.setDestreza(dest);
        
    }
}
