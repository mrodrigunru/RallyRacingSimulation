import java.io.*;
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
    
    /**
     * Metodo que devuelve el tiempo de un piloto en un circuito
     * 
     * @param nomCircuito el nombre del circuito
     * 
     * @return tiempo en ese circuito
     */
    public double getTiempoEnCircuito(String nomCircuito){
        Resultados res = resultados.get(nomCircuito);
        return res.getTiempo();
        
    }
    
    /**
     * Metodo que crea una entrada de la calse resultados con los parametros dados
     * 
     * @param nomCircuito nombre del circuito
     * @param tiempo tiempo en ese circuito
     * @param puntos puntos conseguidos en ese circuito
     */
    public void crearEntradaResultados(String nomCircuito, double tiempo, double puntos){
        Resultados res = new Resultados();
        res.setTiempo(tiempo);
        res.setPuntos(puntos);
        
        resultados.put(nomCircuito, res);
    }
    
    /**
     * Metodo que actualiza el tiempo en un circuito 
     * 
     * @param nomCircuito el nombre del circuito
     * @param tiempo el tiempo en dicho circuito
     */
    public void setTiempoEnCircuito (String nomCircuito, double tiempo){
        Resultados res = resultados.get(nomCircuito);
        
        res.setTiempo(tiempo);
    }
    
    /**
     * Metodo que actualiza los puntos en un circuito
     * 
     * @param nomCircuito nombre del circuito
     * @param puntos puntos en dicho circuito
     */
    public void setPuntosEnCircuito (String nomCircuito, double puntos){
        Resultados res = resultados.get(nomCircuito);
        
        res.setPuntos(puntos);
    }
    
    /**
     * Metodo que devuelve los puntos en un circuito
     * 
     * @param nomCircuito nombre del circuito
     * @return puntos puntos en dicho circuito
     */
    public double getPuntosEnCircuito(String nomCircuito){

        Resultados res = resultados.get(nomCircuito);
        return res.getPuntos();
        
    }
    
    /** 
     * Metodo que anula los puntos conseguidos a un piloto
     */
    public void anularPuntos(){
        this.puntosAcumulados = 0;
    }
    
    /**
     * Metodo que devuelve el total de puntos de un piloto
     * 
     * @return total de puntos acumulados
     */
    public int getPuntosAcumulados(){
        return puntosAcumulados;
    }
    
    /**
     * Metodo que actualiza los puntos acumulados
     * 
     * @paran puntos puntos a sumar
     */
    public void sumarPuntosAcumulados(int puntos){
        this.puntosAcumulados = this.puntosAcumulados + puntos;
    }
    
    /**
     * Metodo que devuelve la paritipacion en las carreras
     * 
     * @return total de participaciones
     */
    public int getParticipacionEnCarreras(){
        return participacionEnCarreras;
    }
    
    /**
     * Metodo que suma una participacion
     */
    public void sumarUnaParticipacionEnCarreras(){
        this.participacionEnCarreras++;
    }
    
    /**
     * Metodo que devuelve el total de carreras terminads
     * 
     * @return total de terminads
     */
    public int getCarrerasTerminadas(){
        return carrerasTerminadas;
    }
    
    /**
     * Metodo que suma una carrera terminada
     */
    public void sumarUnaCarrerasTerminadas(){
        this.carrerasTerminadas++;
    }
    
    /**
     * Metodo que devuelve el total de abandonos
     * 
     * @return total de abandonos
     */
    public int getCarrerasAbandonadas(){
        return carrerasAbandonadas;
    }
    
    /**
     * Metodo que suma un abandono
     */
    public void sumarUnaCarrerasAbandonadas(){
        this.carrerasAbandonadas++;
    } 
    
    /**
     * Metodo que devuelve si un piloto esta descalificado
     * 
     * @return T o F si esta descalificado
     */
    public boolean getDescalificado(){
        return descalificado;
    }
    
    /**
     * Metodo que devuelve un map con los resultados en los circuitos
     * 
     * @returm map de los resultados
     */
    public HashMap<String, Resultados> getMapResultados(){
        return resultados;
    }
    
    /**
     * Metodo que asigna la condicion de descalificado a unj piloto
     * 
     * @param descalificado T o F si esta o no descalificado
     */
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
    
    /**
     * Metodo que calcula la destreza de un piloto
     */
    public abstract double calcularDestreza();
    
    /**
     * Metodo que conduce el coche
     * 
     * @param coche coche asignado
     * @param circuito ciruito asignado
     * 
     * @throws IOException
     */
    public void conducir(Coche coche, Circuito circuito) throws IOException{
        double vr =  coche.getVelReal();
        double tet = coche.tiempoEnTerminar(circuito.getDistanciaActual(),vr);
        double conc = getValorConcentracion();
        double comb = coche.combustibleRestante(coche.getCombustibleActual(), tet);
        
        if (tet < conc && comb>0){      //tet < conc && tet < comb
           crearEntradaResultados(circuito.getNombre(), tet, 0.0 );
           coche.setCombustibleActual(comb);
           
           print("+++ "+ getNombre()+" termina la carrera en"+ getTiempoEnCircuito(circuito.getNombre()) +" minutos +++");
           print("+++ El combustible del "+ coche.getNombre()+" tras la carrera es "+ comb +"+++");
           
           //sumas solo si t > 0
           sumarUnaParticipacionEnCarreras();
           
           sumarUnaCarrerasTerminadas();
             
        }
        else if (tet > conc){      
           conc = conc - tet;
           crearEntradaResultados(circuito.getNombre(), conc, 0.0 );
           double comb2 = coche.combustibleRestante(coche.getCombustibleActual(), getValorConcentracion());
          
           coche.setCombustibleActual(comb2);
           sumarUnaCarrerasAbandonadas();
            
         print("¡¡¡ "+ getNombre()+" perdió la concentración a falta de "+ -Math.round((getTiempoEnCircuito(circuito.getNombre()))*100d) / 100d
           +"minutos para terminar !!!");
         print("¡¡¡ En el momento del despiste llevaba en carrera"+ getValorConcentracion()+ " minutos !!!");
         print("+++ El combustible del "+ coche.getNombre()+" tras la carrera es "+ coche.getCombustibleActual() +"+++");
         
         
         print("@@@");
         print("@@@");
              }
            else if(comb<=0){    //tet > comb
                
                crearEntradaResultados(circuito.getNombre(), comb, 0.0 );                        //cambio coche.getCombustibleActual() por comb
                coche.setCombustibleActual(coche.combustibleRestante(coche.getCombustibleActual(), tet));
                
                sumarUnaCarrerasAbandonadas();
                
                
             print("¡¡¡ El "+ coche.getNombre()+" se quedó sin combustible a falta de" +
             -coche.getCombustibleActual() + "minutos para terminar !!!");
             print("¡¡¡ En el momento de quedarse sin combustible llevaba en carrera "+ comb +  " minutos !!!");
             print("+++ El combustible del "+ coche.getNombre()+" tras la carrera es "+ coche.getCombustibleActual() +"+++");
             
             //coche.setCombustibleActual(0);
             coche.setNoFuel();
             
             print("@@@");
             print("@@@");
                   }
    }
    
    /**
     *
     * It prints a chain both in logFile and console
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void print (String chain) throws IOException{
        LogFile lg = LogFile.getInstance();
        lg.write(chain);
        System.out.println(chain);

    } 
    
    
    /**
     * @param number the number which precision we want to correct
     * @param digits the number of decimals we want number to have
     * 
     * @return the number with his presision corrected
     */
    
      public  double decimals(double number, int digits) {
        double result;
        result = number * Math.pow(10, digits);
        result = Math.round(result);
        result = result/Math.pow(10, digits);
        return result;
    }
    
   /**
    * Metodo que devuelve las caracteristicas del piloto
    */
   public String getTipoPiloto(){
     return "";  
    }
   
    /**
     * Metodo que imprime las caracteristicas del piloto
     */
   public String toString(){
       return "<piloto: " + getNombre() + "> <tipo:"+ getTipoPiloto() + "> <dest:" + calcularDestreza() + "> <conc: " +
       getConcentracion() + "(" +getValorConcentracion()+ ")> <descalificado: " + getDescalificado();
    }
}
