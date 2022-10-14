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
    private double velocidadReal;
    private boolean noFuel;
    

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
        this.noFuel = false;
        
    }
    
    /**
     * Calcula la velocidad real de los coches en el cirucito
     * 
     * @param   
     *          double destreza: destreza del piloto
     *          Complejidad complejidad: complejidad del circuito
     * @return        double velocidadReal: la velocidad real del coche
     */
    public double velocidadReal( double destreza, double complejidad) throws IOException{
         
        double vt = velocidad.getValor();
        
        double vr = (vt * destreza)/complejidad;
        vr = Math.round((vr)*100d) / 100d;
        this.velocidadReal = vr;
        return vr;
    }
    
    /**
     * devuelve la velocidad real del coche
     * 
     * @return double velocidadReal : la valocidad real del coche
     */
    public double getVelReal(){
        return velocidadReal;
    }
    
    /**
     * Actualiza la velocidad real del coche
     * 
     * @param double vel: el nuevo valor de la velocidad real 
     * 
     */
    public void setVelReal(double vel){
        this.velocidadReal = vel;
    }
    
    /**
     * Metodo que actualiza cuando un coche se queda sin combustible
     * 
     */
    public void setNoFuel(){
        this.noFuel = true;
    }
    
    
    /**
     * Metodo que devuelve si el coche se ha quedado sin combustible
     */
    public boolean getNoFuel(){
        return noFuel;
    }
    
    /**
     * Calcula el tiempo en terminar de los coches en el circuito
     * 
     * @param   Distancia distancia: distancia del circuito
     *          double velocidadReal: velocidad real del coche
     * @return        double tiempoEnTerminar: el tiempo que tarda un coche en completar el circuito
     */
    public double tiempoEnTerminar(double distancia, double velocidadReal){
        
        
        double tet = (distancia / velocidadReal) *60;
        tet = Math.round((tet)*100d) / 100d;
        return tet;
    }
    
    /**
     * Calcula el combustible que queda en el coche al terminar el circuito
     * 
     * @param   Combustible combustible: combustible del coche
     *          double tiempoEnTerminar: tiempo que tarda un coche en completar el circuito
     * @return        double combustibleRestante: el combustible restante del coche
     */
    public double combustibleRestante(double combustible, double tiempoEnTerminar) throws IOException{
        
        
        double cr = combustible - tiempoEnTerminar;
        cr = Math.round((cr)*100d) / 100d;
        //this.combustibleActual = cr;
        return cr;
    }
    
    /**
     * Metodo que devuelve el nombre del coche
     * 
     * @param   (nada)     
     * @return  nombre del coche
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo que asigna el nombre al coche
     * 
     * @param   nombre del coche     
     * @return  (nada)
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Metodo que devuelve la velocidad del coche
     * 
     * @param   (nada)     
     * @return  velocidad del coche
     */
    public Velocidad getVelocidad(){
        return velocidad;
    }
    
    /**
     * Metodo que devuelve el valor de la velocidad del coche
     * 
     * @param   (nada)     
     * @return  valor de la velocidad del coche
     */
    public double getValorVelocidad(){
        return velocidad.getValor();
    }
    
    /**
     * Metodo que asigna la velocidad al coche
     * 
     * @param   velocidad del coche    
     * @return  (nada) 
     */
    public void setVelocidad(Velocidad velocidad){
        this.velocidad = velocidad;
    }
    
    /**
     * Metodo que devuelve la etiqueta del combustible original del coche
     * 
     * @param   (nada)     
     * @return  combustible original del coche
     */
    public Combustible getCombustible(){
        return combustible;
    }
    
    /**
     * Metodo que devuelve el valor del combustible original del coche
     * 
     * @param   (nada)     
     * @return  valor del combustible del coche
     */
    public double getValorCombustible(){
        return combustible.getValor();
    }
    
    /**
     * Metodo que devuelve el combustible actual del coche
     * 
     * @param   (nada)     
     * @return  combustible actual del coche
     */
    public double getCombustibleActual(){
        return this.combustibleActual;
    }
    
    /**
     * Metodo que asigna el valor del combustible original al coche
     * 
     * @param   combustible del coche    
     * @return  (nada) 
     */
    public void setCombustible(Combustible combustible){
        this.combustible = combustible;
        this.combustibleActual = combustible.getValor();
    }
    
    /**
     * Metodo que asigna el valor del combustible actual al coche
     * 
     * @param   combustible del coche    
     * @return  (nada) 
     */
    public void setCombustibleActual(double combustible){
        this.combustibleActual = combustible;
    }
    
    /**
     * @param number the number which precision we want to correct
     * @param digits the number of decimals we want number to have
     * 
     * @return the number with his presision corrected
     */
    
      public  double decimals(double number, int digits) {
        double result;
        result = number * Math.pow(10, digits);
        result = Math.round(result);
        result = result/Math.pow(10, digits);
        return result;
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
    
    /**
     * Método que imprime las caracteristicas del Coche
     */
    public String toString(){
        return "";
    }
}
