
/**
 * Write a description of class CocheRapido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheRapido extends CocheAbstract
{
    int nitro;

    /**
     * Constructor for objects of class CocheRapido
     */
    public CocheRapido(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
    }

    @Override
    public double velocidadReal(Velocidad velocidad, double destreza, Complejidad complejidad){
        double vr = 0.0;
        double vt = velocidad.getValor();
        double cc = complejidad.getValor();
        
        if (nitro == 0){           
        vr = vt * destreza;
        vr = vr / cc;
        }
        else {
            //implementar opcion de si tiene nitro
            
        }
        
        return vr;
    }
}
