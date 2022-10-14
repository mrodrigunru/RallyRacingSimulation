
/**
 * Write a description of class CirImpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CirImpl implements Circuito
{
    
    private Complejidad complejidad;
    private double complejidadActual;
    private Distancia distancia;
    private double distanciaActual;
    private String nombre;
    private Circuito decoratedCircuito;
    
    /**
     * Constructor for objects of class CirImpl
     */
    public CirImpl(String nombre, Complejidad complejidad, Distancia distancia)
    {
        this.nombre = nombre;
        this.complejidad = complejidad;
        this.complejidadActual = complejidad.getValor();
        this.distancia = distancia;  
        this.distanciaActual = distancia.getValor();
    }
    
     /**
     * @param number the number which precision we want to correct
     * @param digits the number of decimals we want number to have
     * 
     * @return the number with his presision corrected
     */
    @Override
      public  double decimals(double number, int digits) {
        double result;
        result = number * Math.pow(10, digits);
        result = Math.round(result);
        result = result/Math.pow(10, digits);
        return result;
    }
    
    /**
     * Metodo que devuelve el nombre del circuito
     */
    @Override
    public String getNombre(){
        return nombre;
    }
    
    
    /**
     * Metodo que devuelve la complejidad original del circuito
     */
    @Override
    public Complejidad getComplejidadOriginal(){
        return complejidad;
    }
    
    /**
     * Metodo que devuelve el valor de la complejidad original
     */
    @Override
    public double getValorComplejidadOriginal(){
        return complejidad.getValor();
    }
    
    /**
     * Metodo que devuelve el valor de la complejidad actual
     */
    @Override
    public double getComplejidadActual(){
        return complejidadActual;
    }
    
    /**
     * Metodo que devuelve la distancia original del circuito
     */
    @Override
    public Distancia getDistanciaOriginal(){
        return distancia;
    }
    
     /**
     * Metodo que devuelve el valor de la distancia original
     */
    @Override
    public double getValorDistanciaOriginal(){
        return distancia.getValor();
    }
    
    /**
     * Metodoq ue devuelve el valor de la distancia actual
     */
    @Override
    public double getDistanciaActual(){
        return distanciaActual;
    }
    
    /**
     * Metodo que actualiza el nombre del circuito
     */
    @Override
    public void setNombre(String nombreNew){
        nombre = nombreNew;
    }
    
    /**
     * Metodo que actualiza la complejidad original
     */
    @Override
    public void setComplejidadOriginal(Complejidad compNew){
        complejidad = compNew;
    }
    
    
    /**
     * Metodo que actualiza la complejidad actual
     */
    @Override
    public void setComplejidadActual(double compAc){
        complejidadActual = compAc;
    }
    
    /**
     * Metodo que actualiza la distancia original
     */
    @Override
    public void setDistanciaOriginal(Distancia disNew){
        distancia = disNew;
    }
    
    /**
     * Metodo que actualiza la distancia actual
     */
    @Override
    public void setDistanciaActual(double disAc){
        distanciaActual = disAc;
    }
    
    /**
     * Metodo que devuelve las condiciones del circuito
     */
    public String getCondiciones(){
        return "";
    }
    
    /**
     * Metodo que imprime las caracteristicas del circuito
     */
    @Override
    public String toString(){
        return "<circuito: " + getNombre() +"> <cond: " + getCondiciones() +
        "> <comp:" + getComplejidadOriginal() + "(original:" + getValorComplejidadOriginal() + ")(actual: " +
        getComplejidadActual() + ")> <dist: " +getDistanciaOriginal() + "(original:" + getValorDistanciaOriginal() + ")(actual: " +
        getDistanciaActual() + ")>";
    }
    
    

}


