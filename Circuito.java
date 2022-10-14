

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
    
    /**
     * Metodo que devuelve el valor de la complejidad actual 
     */
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
    
    /**
     * Metodo que devuelve el valor de la distancia actual
     */
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
    
    /**
     * Metodo que actualiza el valor de la complejidad actual
     */
    public void setComplejidadActual(double compAc);
    
    /**
     * Asigna la distancia del circuito
     * 
     * @param  la distancia del circuito
     * @return  (none)
     */
    public void setDistanciaOriginal(Distancia disNew);
    
    /**
     * Metodo que actualiza el valor de la distancia actual
     */
    public void setDistanciaActual(double disAc);
    
    /**
     * @param number the number which precision we want to correct
     * @param digits the number of decimals we want number to have
     * 
     * @return the number with his presision corrected
     */
    
    public abstract double decimals(double number, int digits);
    
    /**
     * Metodo que devuelve las condiciones del circuito
     */
    public String getCondiciones();
    
    /**
     * Metodo que imprime las caracteristicas de la clase
     */
    public String toString();
}
