
/**
 * Write a description of class CircuitoImpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircuitoImpl implements Circuito
{
    private Complejidad complejidad;
    private Distancia distancia;
    private String nombre;
    
    
    public CircuitoImpl(String nombre, Complejidad complejidad, Distancia distancia)
    {
        this.nombre = nombre;
        this.complejidad = complejidad;
        this.distancia = distancia;        
    }
    
   @Override
   public String getNombre(){
        return nombre;
    }
    
    @Override
    public Complejidad getComplejidad(){
        return complejidad;
    }
    
    @Override
    public double getValorComplejidad(){
        return complejidad.getValor();
    }
    
    @Override
    public Distancia getDistancia(){
        return distancia;
    }
    
    @Override
    public double getValorDistancia(){
        return distancia.getValor();
    }
    
    @Override
    public void setNombre(String nombreNew){
        nombre = nombreNew;
    }
    
    @Override
    public void setComplejidad(Complejidad compNew){
        complejidad = compNew;
    }
    
    @Override
    public void setDistancia(Distancia disNew){
        distancia = disNew;
    }
}
