
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
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public Complejidad getComplejidadOriginal(){
        return complejidad;
    }
    
    @Override
    public double getValorComplejidadOriginal(){
        return complejidad.getValor();
    }
    
    @Override
    public double getComplejidadActual(){
        return complejidadActual;
    }
    
    @Override
    public Distancia getDistanciaOriginal(){
        return distancia;
    }
    
    @Override
    public double getValorDistanciaOriginal(){
        return distancia.getValor();
    }
    
    @Override
    public double getDistanciaActual(){
        return distanciaActual;
    }
    
    @Override
    public void setNombre(String nombreNew){
        nombre = nombreNew;
    }
    
    @Override
    public void setComplejidadOriginal(Complejidad compNew){
        complejidad = compNew;
    }
    
    @Override
    public void setComplejidadActual(double compAc){
        complejidadActual = compAc;
    }
    
    @Override
    public void setDistanciaOriginal(Distancia disNew){
        distancia = disNew;
    }
    
    @Override
    public void setDistanciaActual(double disAc){
        distanciaActual = disAc;
    }
    
    public String getCondiciones(){
        return "";
    }
    
    @Override
    public String toString(){
        return "<circuito: " + getNombre() +"> <cond: " + getCondiciones() +
        "> <comp:" + getComplejidadOriginal() + "(original:" + getValorComplejidadOriginal() + ")(actual: " +
        getComplejidadActual() + ")> <dist: distancia(original:" + getValorDistanciaOriginal() + ")(actual: " +
        getDistanciaActual() + ")>";
    }
    
    

}


