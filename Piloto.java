import java.util.HashMap;

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
    private int puntosAcumulados;
    private boolean descalificado;
    private int participacionEnCarreras;
    private int carrerasTerminadas;
    private int carrerasAbandonadas;
    
    //string es el nombre del circuito y resultados es la subclase
    private HashMap<String, Resultados> resultados;
    /**
     * Clase que recoge los resultados de un piloto en un circuito
     */
    public class Resultados {
        double tiempo;
        double puntos;   
        
        public double getTiempo(){
        return tiempo;
        }
        
        public double getPuntos(){
        return puntos;
        }
        
        public void setTiempo(double tiempo){
        this.tiempo = tiempo;
        }
        
        public void setPuntos(double puntos){
        this.puntos = puntos;
        }
    }
    
    
    /**
     * Constructor for objects of class Piloto
     * 
     * @param nombre:   nombre del piloto
     *                  concentracion del piloto
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
        this.resultados = new HashMap <String, Resultados> ();
    }

    /**
     * Metodo que devuelve el nombre del piloto
     * 
     * @param   (nada)
     * @return     el nombre del piloto
     */
    public String getNombre()
    {       
        return this.nombre;
    }
    
    /**
     * Metodo que asigna el nombre del piloto
     * 
     * @param  nombre del piloto
     * @return  (nada)
     */
    public void setNombre(String nombre){
     this.nombre = nombre;   
    }
    
    /**
     * Metodo que devuelve la concentracion del piloto
     * 
     * @param  (none)
     * @return     concentracion del piloto
     */
    public Concentracion getConcentracion(){
        return concentracion;
    }
    
    /**
     * Metodo que devuelve el valor de la concentracion del piloto
     * 
     * @param  (none)
     * @return     valor de la concentracion del piloto
     */
    public double getValorConcentracion(){
        return concentracion.getValor();
    }
    
    /**
     * Metodo que asigna la concentracion del piloto
     * 
     * @param  concentracion del piloto
     * @return  (nada)
     */
    public void setConcentracion(Concentracion conc){
        this.concentracion = conc;
    }
    
    
    /**
     * Metodo que devuelve el coche del piloto
     * 
     * @param  (none)
     * @return     coche del piloto
     */
    public Coche getCoche(){
        return coche;
    }
    
    /**
     * Metodo que asigna el coche del piloto
     * 
     * @param  coche del piloto
     * @return  (nada)
     */
    public void setCoche (Coche coche){
        this.coche = coche;
    }
    
    public double getTiempoEnCircuito(String nomCircuito){
        Resultados res = resultados.get(nomCircuito);
        return res.getTiempo();
        
    }
    
    public void crearEntradaResultados(String nomCircuito, double tiempo, double puntos){
        Resultados res = new Resultados();
        res.setTiempo(tiempo);
        res.setPuntos(puntos);
        
        resultados.put(nomCircuito, res);
    }
    
    public void setTiempoEnCircuito (String nomCircuito, double tiempo){
        Resultados res = resultados.get(nomCircuito);
        
        res.setTiempo(tiempo);
    }
    
    public void setPuntosEnCircuito (String nomCircuito, double puntos){
        Resultados res = resultados.get(nomCircuito);
        
        res.setPuntos(puntos);
    }
    
    public double getPuntosEnCircuito(String nomCircuito){
        Resultados res = resultados.get(nomCircuito);
        return res.getPuntos();
        
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
    
    /**
     * Metodo que devuelve la destreza del piloto
     * 
     * @param  (nada)
     * @return     destreza del piloto
     */
    public double getDestreza(){
        return destreza;
    }
    
    /**
     * Metodo que asigna la destreza del piloto
     * 
     * @param  destreza del piloto
     * @return  (nada)
     */
    public void setDestreza(double destreza){
        this.destreza = destreza;
    }
    
    public abstract double calcularDestreza();
    
    public void conducir(Coche coche, Circuito circuito){
        double tet = coche.tiempoEnTerminar(circuito.getDistanciaActual(), coche.velocidadReal(coche.getVelocidad(), calcularDestreza(), circuito.getComplejidadActual()));
        double conc = getValorConcentracion();
        double comb = coche.getCombustibleActual();
        
        if (tet < conc && tet < comb){
           crearEntradaResultados(circuito.getNombre(), tet, 0.0 );
           comb = comb - tet;
           coche.setCombustibleActual(comb);
        }
        else if (tet > conc && tet < comb){
            conc = conc - tet;
           crearEntradaResultados(circuito.getNombre(), tet, 0.0 );
           comb = comb - conc;
           coche.setCombustibleActual(comb);
              }
            else if(tet < conc && tet > comb){
                comb = comb - tet;
                crearEntradaResultados(circuito.getNombre(), comb, 0.0 );
                comb = 0;
                coche.setCombustibleActual(comb);
                   }
    }
    
   
   public String getTipoPiloto(){
     return "";  
    }
   
   public String toString(){
       return "<piloto: " + getNombre() + "> <tipo:"+ getTipoPiloto() + "> <dest:" + calcularDestreza() + "> <conc: " +
       getConcentracion() + "(" +getValorConcentracion()+ ")> <descalificado: " + getDescalificado();
    }
}
