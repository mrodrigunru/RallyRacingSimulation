
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
     public void calcularDestreza()
    {
        double dest = 0.0;
        double conc = super.getConcentracion().getValor();
        dest = conc * 0.97;
        dest = dest / 120;
        dest = dest - 0.03;
        
        super.setDestreza(dest);
        
    }
}
