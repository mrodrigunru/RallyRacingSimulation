
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
    
    public Complejidad getComplejidad();
    
    public double getValorComplejidad();
    
    public Distancia getDistancia();
    
    public double getValorDistancia();
    
    public void setNombre(String nombreNew);
    
    public void setComplejidad(Complejidad compNew);
    
    public void setDistancia(Distancia disNew);
}
