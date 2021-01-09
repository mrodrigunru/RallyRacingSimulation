import java.io.*;
/**
 * Abstract class CocheAbstract - maneja todos los campos relacionados con coche
 * @author: Manuel Rodriguez && Marcos Santos
 * Date: 1.0
 */
public abstract class CocheAbstract implements Coche
{
    private Velocidad velocidad;
    private Combustible combustible;
    private double combustibleActual;
    private String nombre;
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public CocheAbstract(String nombre, Velocidad velocidad, Combustible combustible)
    {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.combustibleActual = combustible.getValor();
        
    }
    
    public double velocidadReal( double destreza, double complejidad){
        double vr = 0.0;
        double vt = velocidad.getValor();
        double cc = complejidad;
        
        vr = vt * destreza;
        vr = vr / cc;
        return vr;
    }
    
    
    public double tiempoEnTerminar(double distancia, double velocidadReal){
        double tet= 0.0;
        double dis = distancia;
        
        tet = dis / velocidadReal;
        tet = tet * 60;
        return tet;
    }
    
    
    public double combustibleRestante(Combustible combustible, double tiempoEnTerminar) throws IOException{
        double cr = 0.0;
        double comb = combustible.getValor();
        
        cr = comb - tiempoEnTerminar;
        this.combustibleActual = cr;
        return cr;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Velocidad getVelocidad(){
        return velocidad;
    }
    
    public double getValorVelocidad(){
        return velocidad.getValor();
    }
    
    public void setVelocidad(Velocidad velocidad){
        this.velocidad = velocidad;
    }
    
    public Combustible getCombustible(){
        return combustible;
    }
    
    public double getValorCombustible(){
        return combustible.getValor();
    }
    
    public double getCombustibleActual(){
        return combustibleActual;
    }
    
    public void setCombustible(Combustible combustible){
        this.combustible = combustible;
        this.combustibleActual = combustible.getValor();
    }
    
    public void setCombustibleActual(double combustible){
        this.combustibleActual = combustible;
    }
    
        /**
     *
     * It prints a chain both in logFile and console
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void print (String chain) throws IOException{
        LogFile lg = LogFile.getInstance();
        lg.write(chain);
        System.out.println(chain);

    } 
    
    public int getMod(){
        return 0;
    }
    
    
    public String toString(){
        return "";
    }
}
