import java.io.*;
/**
 * Write a description of class CocheRapido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheRapido extends CocheNormal
{
    private double nitroOriginal = 80;
    private double nitroRes;

    /**
     * Constructor for objects of class CocheRapido
     * 
     * @param String nombre: nombre del coche
     * @param Velocidad velocidad: velociadad original del coche
     * @param Combustible combustible: combustible original del coche
     */
    public CocheRapido(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
        nitroRes= getNitroOriginal();
    }

    /**
     * Metodo que devuelve el nitro inicial del coche
     * 
     * @return double nitroOriginal
     */
    public double getNitroOriginal(){
        return nitroOriginal;
    }
    
    /**
     * Metodo que actualiza el nitro inicial del coche
     * 
     * @param double nitro: el nuevo valor del nitro
     */
    public void setNitroOriginal(double nitro){
        this.nitroOriginal = nitro;
    }
    
    /**
     * Metodo que devuelvel el nitro restante
     * 
     * @return double nitroRes: valor del nitro restante
     */
    public double getNitroRes(){
        return nitroRes;
    }
    
    /**
     * Metodo que actualiza el nitro restante
     * 
     * @param double nitro: el nuevo valor del nitro restante
     */
    public void setNitroRes(double nitro){
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
        
        double vt = getValorVelocidad();
        double cc = complejidad;
        double nitroRestante = getNitroRes();
        
        double vr = (vt * destreza) /cc;
        vr = Math.round((vr)*100d) / 100d;
        double vmax = vr + vr * 0.2;
        vmax = Math.round((vmax)*100d) / 100d;
        if (nitroRestante > 0){
            while(vr <= vmax && nitroRestante > 0){
                
                vr += 0.01;
                nitroRestante -= 0.01;
            }
              vr = Math.round((vr)*100d) / 100d;
            double usado = getNitroOriginal() - nitroRestante;
            usado = Math.round((usado)*100d) / 100d;
            print("+++ El "+getNombre()+" usa "+ usado +" de nitro para alcanzar "+ Math.round((vr)*100d) / 100d
             +" km/hora y el nitro restante es "+
            Math.round((nitroRestante)*100d) / 100d  +"+++");
                        

        }
        setNitroRes(nitroRestante);
        
        setVelReal(vr);
        return vr;
    }
    
    /**
     * Metodo que devuelve el tipo de coche 
     * 
     * @return String tipo: tipo de coche
     */
    public String getTipo(){
        return getClass().getName();
    }
    
     /**
     * Método que imprime las caracteristicas del Coche
     */
    @Override
    public String toString(){
        return "<coche:" +getNombre() + "> <tipo:" + getTipo() + "> <vel_teó:" +  getVelocidad() +
         "(" + getValorVelocidad() + ")> <comb: "+ getCombustible() + "(" + getValorCombustible() + ") (actual:" + getCombustibleActual() +
         ")> > <nitroPendiente: " + getNitroRes() + ">";
    }
}
