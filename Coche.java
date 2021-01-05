
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
    
    /**
     * Calcula el tiempo en terminar de los coches en el circuito
     * 
     * @param   Distancia distancia: distancia del circuito
     *          double velocidadReal: velocidad real del coche
     * @return        double tiempoEnTerminar: el tiempo que tarda un coche en completar el circuito
     */
    public double tiempoEnTerminar(Distancia distancia, double velocidadReal);
    
    /**
     * Calcula el combustible que queda en el coche al terminar el circuito
     * 
     * @param   Combustible combustible: combustible del coche
     *          double tiempoEnTerminar: tiempo que tarda un coche en completar el circuito
     * @return        double combustibleRestante: el combustible restante del coche
     */
    public double combustibleRestante(Combustible combustible, int tiempoEnTerminar);
    
    /**
     * Metodo que devuelve el nombre del coche
     * 
     * @param   (nada)     
     * @return  nombre del coche
     */
    public String getNombre();
    
    /**
     * Metodo que asigna el nombre al coche
     * 
     * @param   nombre del coche     
     * @return  (nada)
     */
    public void setNombre(String nombre);
    
    /**
     * Metodo que devuelve la velocidad del coche
     * 
     * @param   (nada)     
     * @return  velocidad del coche
     */
    public Velocidad getVelocidad();
    
    /**
     * Metodo que devuelve el valor de la velocidad del coche
     * 
     * @param   (nada)     
     * @return  valor de la velocidad del coche
     */
    public double getValorVelocidad();
    
    /**
     * Metodo que asigna la velocidad al coche
     * 
     * @param   velocidad del coche    
     * @return  (nada) 
     */
    public void setVelocidad(Velocidad velocidad);
    
    /**
     * Metodo que devuelve el combustible original del coche
     * 
     * @param   (nada)     
     * @return  combustible original del coche
     */
    public Combustible getCombustible();
    
    /**
     * Metodo que devuelve el combustible restante del coche
     * 
     * @param   (nada)     
     * @return  combustible actual del coche
     */
    public double getCombustibleActual();
    
    /**
     * Metodo que devuelve el valor del combustible original del coche
     * 
     * @param   (nada)     
     * @return  valor del combustible del coche
     */
    public double getValorCombustible();
    
    /**
     * Metodo que asigna el valor del combustible original al coche
     * 
     * @param   combustible del coche    
     * @return  (nada) 
     */
    public void setCombustible(Combustible combustible);
    
    /**
     * Metodo que asigna el valor del combustible actual al coche
     * 
     * @param   combustible del coche    
     * @return  (nada) 
     */
    public void setCombustibleActual(double combustible);
    
    public String getTipo();
    
    public String toString();
    
}
