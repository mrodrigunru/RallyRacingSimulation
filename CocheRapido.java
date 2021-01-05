
/**
 * Write a description of class CocheRapido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheRapido extends CocheAbstract
{
    private int nitro = 80;

    /**
     * Constructor for objects of class CocheRapido
     */
    public CocheRapido(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
    }

    public int getNitro(){
        return nitro;
    }
    
    public void setNitro(int nitro){
        this.nitro = nitro;
    }
    
    
    /**
     * Calcula la velocidad de un coche con nitro
     * 
     * @param   Velocidad velocidad: velocidad teorica del vehiculo,
     *          double destreza: destreza del piloto
     *          Complejidad complejidad: complejidad del circuito
     */
    @Override
    public double velocidadReal(Velocidad velocidad, double destreza, Complejidad complejidad){
        double vr = 0.0;
        double vmax = 0.0;
        double vt = velocidad.getValor();
        double cc = complejidad.getValor();
        int nitroRestante = getNitro();
        
        vr = vt * destreza;
        vr = vr / cc;
        vmax = vr + vr * 0.2;
        if (nitroRestante != 0){
            while(vr <= vmax && nitroRestante > 0){
                
                vr ++;
                nitroRestante --;
            }
        }
        setNitro(nitroRestante);
        return vr;
    }
    
   
    public String getTipo(){
        return getClass().getName();
    }
    
    @Override
    public String toString(){
        return "<coche:" +getNombre() + "> <tipo:" + getTipo() + "> <vel_teó:" +  getVelocidad() +
         "(" + getValorVelocidad() + ")> <comb: "+ getCombustible() + "(" + getValorCombustible() + ") (actual:" + getCombustibleActual() +
         ")> > <nitroPendiente: " + getNitro() + ">";
    }
}
