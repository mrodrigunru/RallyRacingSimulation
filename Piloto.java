
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
    private int tiempoEnCircuito;
    private int puntosEnCircuito;
    private int puntosAcumulados;
    private boolean descalificado;
    private int participacionEnCarreras;
    private int carrerasTerminadas;
    private int carrerasAbandonadas;
    

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
        this.descalificado = false;
        this.puntosAcumulados = 0;
        this.participacionEnCarreras = 0;
        this.carrerasTerminadas = 0;
        this.carrerasAbandonadas = 0;
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
    
    public int getTiempoEnCircuito(){
        return tiempoEnCircuito;
    }
    
    public void setTiempoEnCircuito (int tiempo){
        this.tiempoEnCircuito = tiempo;
    }
    
    public int getPuntosEnCircuito(){
        return puntosEnCircuito;
    }
    
    public void setPuntosEnCircuito(int puntos){
        this.puntosEnCircuito = puntos;
    }
    
    public int getPuntosAcumulados(){
        return puntosAcumulados;
    }
    
    public void sumarPuntosAcumulados(int puntos){
        this.puntosAcumulados = this.puntosAcumulados + puntos;
    }
    
    public int getParticipacionEnCarreras(){
        return participacionEnCarreras;
    }
    
    public void sumarUnaParticipacionEnCarreras(){
        this.participacionEnCarreras++;
    }
    
    public int getCarrerasTerminadas(){
        return carrerasTerminadas;
    }
    
    public void sumarUnaCarrerasTerminadas(){
        this.carrerasTerminadas++;
    }
    
    public int getCarrerasAbandonadas(){
        return carrerasAbandonadas;
    }
    
    public void sumarUnaCarrerasAbandonadas(){
        this.carrerasAbandonadas++;
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
    
    public abstract void calcularDestreza();
    
    public void conducir(Coche coche, Circuito circuito){
        //TO DO
    }
}
