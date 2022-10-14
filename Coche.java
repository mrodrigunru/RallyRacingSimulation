import java.io.*;
/**
 * Write a description of interface Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Coche
{
    /**
     * Calcula la velocidad real de los coches en el cirucito
     * 
     * @param   
     *          double destreza: destreza del piloto
     *          Complejidad complejidad: complejidad del circuito
     * @return        double velocidadReal: la velocidad real del coche
     */
    public double velocidadReal( double destreza, double complejidad) throws IOException;
    
    /**
     * Devuelve la velocidad real del coche
     * 
     * @return double velocidadReal : la valocidad real del coche
     */
    public double getVelReal();
    
    /**
     * Actualiza la velocidad real del coche
     * 
     * @param double vel: el nuevo valor de la velocidad real 
     * 
     */
    public void setVelReal(double vel);
    
    /**
     * Metodo que actualiza cuando un coche se queda sin combustible
     * 
     */
    public void setNoFuel();
    
    /**
     * Metodo que devuelve si el coche se ha quedado sin combustible
     */
    public boolean getNoFuel();
    
    /**
     * Calcula el tiempo en terminar de los coches en el circuito
     * 
     * @param   Distancia distancia: distancia del circuito
     *          double velocidadReal: velocidad real del coche
     * @return        double tiempoEnTerminar: el tiempo que tarda un coche en completar el circuito
     */
    public double tiempoEnTerminar(double distancia, double velocidadReal);
    
    /**
     * Calcula el combustible que queda en el coche al terminar el circuito
     * 
     * @param   Combustible combustible: combustible del coche
     *          double tiempoEnTerminar: tiempo que tarda un coche en completar el circuito
     * @return        double combustibleRestante: el combustible restante del coche
     */
    public double combustibleRestante(double combustible, double tiempoEnTerminar) throws IOException;
    
    /**
     * Metodo que devuelve el nombre del coche
     * 
     * @param   (nada)     
     * @return  nombre del coche
     */
    public String getNombre();
    
    /**
     * Metodo que asigna el nombre al coche
     * 
     * @param   nombre del coche     
     * @return  (nada)
     */
    public void setNombre(String nombre);
    
    /**
     * Metodo que devuelve la velocidad del coche
     * 
     * @param   (nada)     
     * @return  velocidad del coche
     */
    public Velocidad getVelocidad();
    
    /**
     * Metodo que devuelve el valor de la velocidad del coche
     * 
     * @param   (nada)     
     * @return  valor de la velocidad del coche
     */
    public double getValorVelocidad();
    
    /**
     * Metodo que asigna la velocidad al coche
     * 
     * @param   velocidad del coche    
     * @return  (nada) 
     */
    public void setVelocidad(Velocidad velocidad);
    
    /**
     * Metodo que devuelve la etiqueta del combustible original del coche
     * 
     * @param   (nada)     
     * @return  combustible original del coche
     */
    public Combustible getCombustible();
    
    /**
     * Metodo que devuelve el combustible restante del coche
     * 
     * @param   (nada)     
     * @return  combustible actual del coche
     */
    public double getCombustibleActual();
    
    /**
     * Metodo que devuelve el valor del combustible original del coche
     * 
     * @param   (nada)     
     * @return  valor del combustible del coche
     */
    public double getValorCombustible();
    
    /**
     * Metodo que asigna el valor del combustible original al coche
     * 
     * @param   combustible del coche    
     * @return  (nada) 
     */
    public void setCombustible(Combustible combustible);
    
    /**
     * Metodo que asigna el valor del combustible actual al coche
     * 
     * @param   combustible del coche    
     * @return  (nada) 
     */
    public void setCombustibleActual(double combustible);
    
    /**
     * @param number the number which precision we want to correct
     * @param digits the number of decimals we want number to have
     * 
     * @return the number with his presision corrected
     */
    
    public  double decimals(double number, int digits);
    
    /**
     *
     * It prints a chain both in logFile and console
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void print (String chain) throws IOException;
    
    /**
     * Metodo que devuelve el tipo de coche 
     * 
     * @return String tipo: tipo de coche
     */
    public String getTipo();
    
    /**
     * Método que imprime las caracteristicas del Coche
     */
    public String toString();
    
}
