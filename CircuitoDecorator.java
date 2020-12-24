/**
 * Abstract class CircuitoWrapper - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class CircuitoDecorator implements Circuito
{
    private Complejidad complejidad;
    private Distancia distancia;
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
        decoratedCircuito = circuito;
        this.nombre = nombre;
        this.complejidad = complejidad;
        this.distancia = distancia;        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Complejidad getComplejidad(){
        return complejidad;
    }
    
    public double getValorComplejidad(){
        return complejidad.getValor();
    }
    
    public Distancia getDistancia(){
        return distancia;
    }
    
    public double getValorDistancia(){
        return distancia.getValor();
    }
    
    public void setNombre(String nombreNew){
        nombre = nombreNew;
    }
    
    public void setComplejidad(Complejidad compNew){
        complejidad = compNew;
    }
    
    public void setDistancia(Distancia disNew){
        distancia = disNew;
    }
    
    
}
