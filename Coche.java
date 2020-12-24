
/**
 * Write a description of interface Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Coche
{
    /**
     * Calcula la velocidad real de los coches en el cirucito
     * 
     * @param   Velocidad velocidad: velocidad teorica del vehiculo,
     *          double destreza: destreza del piloto
     *          Complejidad complejidad: complejidad del circuito
     * @return        double velocidadReal: la velocidad real del coche
     */
    public double velocidadReal(Velocidad velocidad, double destreza, Complejidad complejidad);
    
    
    public double tiempoEnTerminar(Distancia distancia, double velocidadReal);
    
    
    public double combustibleRestante(Combustible combustible, int tiempoEnTerminar);
    
    public String getNombre();
    
    public void setNombre(String nombre);
    
    public Velocidad getVelocidad();
    
    public double getValorVelocidad();
    
    public void setVelocidad(Velocidad velocidad);
    
    public Combustible getCombustible();
    
    public double getValorCombustible();
    
    public void setCombustible(Combustible combustible);
}
