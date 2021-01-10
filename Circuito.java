

/**
 * Write a description of interface Circuito here.
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */

public interface Circuito
{
    /**
     * Devuelve el nombre del circuito
     * 
     * @param  (none)
     * @return  el nombre del circuito
     */
    public String getNombre();
    
    /**
     * Devuelve la complejidad del circuito
     * 
     * @param  (none)
     * @return  la complejidad del circuito
     */
    public Complejidad getComplejidadOriginal();
    
    public double getComplejidadActual();
    
    /**
     * Devuelve el valor de la complejidad del circuito
     * 
     * @param  (none)
     * @return  el valor de la complejidad del circuito
     */
    public double getValorComplejidadOriginal();
    
    /**
     * Devuelve la distancia del circuito
     * 
     * @param  (none)
     * @return  la distancia del circuito
     */
    public Distancia getDistanciaOriginal();
    
    public double getDistanciaActual();
    
    /**
     * Devuelve el valor de la distancia del circuito
     * 
     * @param  (none)
     * @return  el valor de la distancia del circuito
     */
    public double getValorDistanciaOriginal();
    
    /**
     * Asigna el nombre del circuito
     * 
     * @param  el nombre del circuito
     * @return  (none)
     */
    public void setNombre(String nombreNew);
    
    /**
     * Asigna la complejidad del circuito
     * 
     * @param  la complejidad del circuito
     * @return  (none)
     */
    public void setComplejidadOriginal(Complejidad compNew);
    
    public void setComplejidadActual(double compAc);
    
    /**
     * Asigna la distancia del circuito
     * 
     * @param  la distancia del circuito
     * @return  (none)
     */
    public void setDistanciaOriginal(Distancia disNew);
    
    public void setDistanciaActual(double disAc);
    
    /**
     * @param number the number which precision we want to correct
     * @param digits the number of decimals we want number to have
     * 
     * @return the number with his presision corrected
     */
    
    public abstract double decimals(double number, int digits);
    
    public String getCondiciones();
    
    public String toString();
}
