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
    
    public Circuito getDecoratedCircuito(){
        return decoratedCircuito;
    }
    
    public String getNombre(){
        return decoratedCircuito.getNombre();
    }
    
    public Complejidad getComplejidadOriginal(){
        return complejidad;
    }
    
    public double getValorComplejidadOriginal(){
        return complejidad.getValor();
    }
    
    public double getComplejidadActual(){
        return decoratedCircuito.getComplejidadActual();
    }
    
    public Distancia getDistanciaOriginal(){
        return distancia;
    }
    
    public double getValorDistanciaOriginal(){
        return distancia.getValor();
    }
    
    public double getDistanciaActual(){
        return decoratedCircuito.getDistanciaActual();
    }
    
    public void setNombre(String nombreNew){
        nombre = nombreNew;
    }
    
    public void setComplejidadOriginal(Complejidad compNew){
        complejidad = compNew;
    }
    
    public void setComplejidadActual(double compAc){
        decoratedCircuito.setComplejidadActual(compAc);
    }
    
    public void setDistanciaOriginal(Distancia disNew){
        distancia = disNew;
    }
    
    public void setDistanciaActual(double disAc){
        decoratedCircuito.setDistanciaActual(disAc);
    }
    
    
}
