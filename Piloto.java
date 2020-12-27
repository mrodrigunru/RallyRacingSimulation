
/**
 * Clase que gestiona todos los campos relacionados con los pilotods
 * 
 * @author Manuel Rodriguez && Marcos Santos 
 * @version 1.0
 */
public abstract class Piloto
{
    private String nombre;
    private Concentracion concentracion;
    private double destreza;
    private Coche coche;
    private int tiempo;
    private int puntos;
    private boolean descalificado;
    

    /**
     * Constructor for objects of class Piloto
     * 
     * @param nombre: nombre del piloto
     *        
     */
    public Piloto(String nombre,Concentracion concentracion)
    {
        this.nombre = nombre;
        this.concentracion = concentracion;
    }

    /**
     * Metodo que devuelve el nombre del piloto
     * 
     * @return     el nombre del piloto
     */
    public String getNombre()
    {       
        return this.nombre;
    }
    
    public void setNombre(String nombre){
     this.nombre = nombre;   
    }
    
    public Concentracion getConcentracion(){
        return concentracion;
    }
    
    public double getValorConcentracion(){
        return concentracion.getValor();
    }
    
    public void setConcentracion(Concentracion conc){
        this.concentracion = conc;
    }
    
    public Coche getCoche(){
        return coche;
    }
    
    public void setCoche (Coche coche){
        this.coche = coche;
    }
    
    public int getTiempo(){
        return tiempo;
    }
    
    public void setTiempo (int tiempo){
        this.tiempo = tiempo;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    
    public boolean getDescalificado(){
        return descalificado;
    }
    
    public void setDescalificado(boolean descalificado){
        this.descalificado = descalificado;
    }
    
    public double getDestreza(){
        return destreza;
    }
    
    public void setDestreza(double destreza){
        this.destreza = destreza;
    }
    
    public abstract void calcularDestreza(Concentracion concentracion);
    
    public void conducir(){
        //TO DO
    }
}
