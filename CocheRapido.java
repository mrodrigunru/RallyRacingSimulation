import java.io.*;
/**
 * Write a description of class CocheRapido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheRapido extends CocheAbstract
{
    private int nitroOriginal = 80;
    private int nitroRes;

    /**
     * Constructor for objects of class CocheRapido
     */
    public CocheRapido(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
        nitroRes= getNitroOriginal();
    }

    public int getNitroOriginal(){
        return nitroOriginal;
    }
    
    public void setNitroOriginal(int nitro){
        this.nitroOriginal = nitro;
    }
    
    public int getNitroRes(){
        return nitroRes;
    }
    
    public void setNitroRes(int nitro){
        this.nitroRes = nitro;
    }
    
    
    
    /**
     * Calcula la velocidad de un coche con nitro
     * 
     * @param   double destreza: destreza del piloto
     *          Complejidad complejidad: complejidad del circuito
     */
    @Override
    public double velocidadReal( double destreza, double complejidad) throws IOException{
        double vr = 0.0;
        double vmax = 0.0;
        double vt = getValorVelocidad();
        double cc = complejidad;
        int nitroRestante = getNitroOriginal();
        
        vr = vt * destreza;
        vr = vr / cc;
        vmax = vr + vr * 0.2;
        if (nitroRestante != 0){
            while(vr <= vmax && nitroRestante > 0){
                
                vr ++;
                nitroRestante --;
            }
             
            int usado = getNitroOriginal() - nitroRestante;
            print("+++ El nombreCoche usa "+ usado +" de nitro para alcanzar"+
            vr +" km/hora y el nitro restante es"+
            nitroRestante +"+++");
                        

        }
        setNitroRes(nitroRestante);
        return vr;
    }
    
    public String getTipo(){
        return getClass().getName();
    }
    
    @Override
    public String toString(){
        return "<coche:" +getNombre() + "> <tipo:" + getTipo() + "> <vel_teó:" +  getVelocidad() +
         "(" + getValorVelocidad() + ")> <comb: "+ getCombustible() + "(" + getValorCombustible() + ") (actual:" + getCombustibleActual() +
         ")> > <nitroPendiente: " + getNitroRes() + ">";
    }
}
