import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Comparator;
import java.io.*;
/**
 * Write a description of class Organizacion here.
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public class Organizacion
{
    
    private int limiteAbandonos;
    private int limitePilotos;
    private TreeSet<Circuito> circuitos;
    private MegaComparadorCircuitos mgcir;
    private HashMap<String, Escuderia> escuderias;
    private ArrayList<Piloto> pilotosCarrera;
    private MegaComparadorPilotos mgp;
    
    private static Organizacion instance = null;

    /**
     * Constructor for objects of class Organization. Es privado debido al Singleton
     */
    private Organizacion()
    {
        this.limiteAbandonos = 0;
        this.limitePilotos = 0;
        circuitos = new TreeSet<Circuito>(mgcir);
        escuderias = new HashMap<String, Escuderia>();
        pilotosCarrera = new  ArrayList<Piloto>();
        
    }

    
    /**
     * Singleton Pattern. Chequea que solo hay una unica instancia de la clase
     * 
     * @param    (no params needed)
     * @return   La instancia actual de la clase
     */
    public static Organizacion getInstance()
    {
        if (instance == null){
            instance = new Organizacion();
        }
        return instance;
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getLimiteAbandonos()
    {
        return this.limiteAbandonos;
    }
    
      /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getLimitePilotos()
    {
        return this.limitePilotos;
    }
    
    public void setLimiteAbandonos(int limA){
        this.limiteAbandonos = limA;
    }
    
    public void setLimitePilotos(int limP){
        this.limitePilotos = limP;
    }
    
    public TreeSet getCircuitos(){
        return circuitos;
    }
    
    public void nuevoCircuito(Circuito circuito){
        circuitos.add(circuito);
    }
    
    public HashMap getEscuderias(){
     return escuderias;   
    }
    
    public void nuevaEscudería(Escuderia escuderia){
        escuderias.put(escuderia.getNombre(), escuderia);
    }
    
    public ArrayList getPilotosCarrera(){
     return   pilotosCarrera;
    }
    
    public void nuevoPilotoCarrera(Piloto piloto){
        pilotosCarrera.add(piloto);
    }
    
    public void mostrarEscuderias() throws IOException{
        print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        print("%%%%%%%% ESCUDERÍAS DEL CAMPEONATO %%%%%%%%");
        print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        
        for(Escuderia escuderia : escuderias.values()){
            print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        
            print(escuderia.toString());
            escuderia.mostrarCadaEscuderia();
            
            print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        
        }
    }
    
    public int condicionFinalizacion(){
        int fin = -1;
        int disponible = 0;
        
        for(Escuderia escuderia : escuderias.values()){
         if (escuderia.getPilotos().size() != 0) {
             disponible++;
            }
        }
        if (disponible == 0) fin = 0;
        if (disponible == 1) fin = 1;
        return fin;
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
}
