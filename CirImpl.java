
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
    
    

}


