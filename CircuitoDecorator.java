/**
 * Abstract class CircuitoWrapper - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class CircuitoDecorator implements Circuito
{
    private Complejidad complejidad;
    private double complejidadActual;
    private Distancia distancia;
    private double distanciaActual;
    private String nombre;
    private Circuito decoratedCircuito;
    
    /**
     * Contructor del decorador de Circuito
     * 
     * @param        String nombre: nombre del circuito,
     *               Complejidad complejidad: la complejidad del circuito,
     *               Distancia distancia: la distancia del circuito
     * @return       (none)
     */
    protected CircuitoDecorator(String nombre, Complejidad complejidad, Distancia distancia, Circuito circuito)
    {
        this.nombre = nombre;
        this.complejidad = complejidad;
        this.complejidadActual = complejidad.getValor();
        this.distancia = distancia;  
        this.distanciaActual = distancia.getValor();
        decoratedCircuito = circuito;
    }
    
    /**
     * Metodo que devuelve el circuito decorador
     */
    public Circuito getDecoratedCircuito(){
        return decoratedCircuito;
    }
    
    /**
     * Metodo que devuelve el nombre del circuito
     */
    public String getNombre(){
        return decoratedCircuito.getNombre();
    }
    
    /**
     * Metodo que devuelve la complejidad original del circuito
     */
    public Complejidad getComplejidadOriginal(){
        return complejidad;
    }
    
    /**
     * Metodo que devuelve el valor de la complejidad original
     */
    public double getValorComplejidadOriginal(){
        return complejidad.getValor();
    }
    
    /**
     * Metodo que devuelve el valor de la complejidad actual
     */
    public double getComplejidadActual(){
        return decoratedCircuito.getComplejidadActual();
    }
    
    /**
     * Metodo que devuelve la distancia original del circuito
     */
    public Distancia getDistanciaOriginal(){
        return distancia;
    }
    
    /**
     * Metodo que devuelve el valor de la distancia original
     */
    public double getValorDistanciaOriginal(){
        return distancia.getValor();
    }
    
    /**
     * Metodoq ue devuelve el valor de la distancia actual
     */
    public double getDistanciaActual(){
        return decoratedCircuito.getDistanciaActual();
    }
    
    /**
     * Metodo que actualiza el nombre del circuito
     */
    public void setNombre(String nombreNew){
        nombre = nombreNew;
    }
    
    /**
     * Metodo que actualiza la complejidad original
     */
    public void setComplejidadOriginal(Complejidad compNew){
        complejidad = compNew;
    }
    
    /**
     * Metodo que actualiza la complejidad actual
     */
    public void setComplejidadActual(double compAc){
        decoratedCircuito.setComplejidadActual(compAc);
    }
    
    /**
     * Metodo que actualiza la distancia original
     */
    public void setDistanciaOriginal(Distancia disNew){
        distancia = disNew;
    }
    
    /**
     * Metodo que actualiza la distancia actual
     */
    public void setDistanciaActual(double disAc){
        decoratedCircuito.setDistanciaActual(disAc);
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
     * Metodo que imprime las caracteristicas del circuito
     */
    @Override
    public String toString(){
        return "<circuito: " + getNombre() +"> <cond: " + getCondiciones() +
        "> <comp:" + getComplejidadOriginal() + "(original:" + getValorComplejidadOriginal() + ")(actual: " +
        getComplejidadActual() + ")> <dist: " +getDistanciaOriginal() + "(original:" + getValorDistanciaOriginal() + ")(actual: " +
        getDistanciaActual() + ")>";
    }
    
    /**
     * Metodo que devuelve las condiciones del circuito
     */
    @Override
    public String getCondiciones(){
        return getDecoratedCircuito().getCondiciones() + getClass().getName();
    }

    
    
}
