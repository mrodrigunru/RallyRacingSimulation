import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.io.*;
/**
 * Represenata a cada escudería en la competicion
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public class Escuderia
{
    private String nombreEsc;
    private ArrayList <Piloto> pilotos;
    private MegaComparadorPilotos mgp;
    private ArrayList<Coche> coches;
    private MegaComparadorCoches mgc;
    /**
     * Constructor for objects of class Escuderia
     */
    public Escuderia(String nombre, MegaComparadorPilotos mgp, MegaComparadorCoches mgc)
    {
       nombreEsc = nombre;
       pilotos = new ArrayList<Piloto>();
       this.mgp = mgp;
       coches = new ArrayList<Coche>();
       this.mgc = mgc;
    }
    
    public MegaComparadorPilotos getMgp(){
        return this.mgp;
    }
    
    public MegaComparadorCoches getMgc(){
        return this.mgc;
    }
    
    /**
     * Metodo que devuelve un ArrayList con los pilotos de la escuderia
     * 
     * @param  none
     * @return     ArrayList de Pilotos
     */
    public ArrayList<Piloto> getPilotos()
    {
        return pilotos;
    }
    
    public void nuevoPiloto(Piloto piloto){
        pilotos.add(piloto);
        
    }
    
    public void ordenarPilotos(MegaComparadorPilotos mgp){
        Collections.sort(pilotos,mgp);
    }
    
    public String getNombre(){
        return nombreEsc;
    }
    
    public void setNombre(String nombre){
        this.nombreEsc = nombre;
    }
    
    /**
     * Saca el primer piloto de la lista que no este descalificado, lo devuelve
     * 
     * @return el primer piloto de la lista
     */
    public Piloto sacarPiloto(int i){
        Piloto p = null;
            p = pilotos.get(i);
          return p;
    }
    
    
    public int contarPilotos(){
        return pilotos.size();
    }
    
    /**
     * Metodo que devuelve un ArrayList con los coches de la escuderia
     * 
     * @param  none
     * @return     ArrayList de coches
     */
    public ArrayList<Coche> getCoches()
    {
        return coches;
    }
    
    public void nuevoCoche(Coche coche){
        coches.add(coche);
    }
    
    public void ordenarCoches(MegaComparadorCoches mgc){
        Collections.sort(coches,mgc);
    }
    
    public int totalPuntosEscuderia(){
        int total = 0;
        for( Piloto piloto : pilotos){
            total = total + piloto.getPuntosAcumulados();
        }
        return total;
    }
    
    public boolean todosDescalificados(){
        boolean cond = false;
        int total = 0;
        for(Piloto piloto : pilotos){
            if (piloto.getDescalificado() == true){
                total ++;
            }
        }
        if (total == pilotos.size()) cond = true;
        return cond;
    }
    
    /**
     * Saca el primer coche de la lista, lo devuelve y lo vuelve a insertar al final
     * 
     * @return el primer coche de la lista
     */
    public Coche sacarCoche(int i){
       Coche c = null;

            if(coches.get(i).getCombustibleActual() > 0){
            c = coches.get(i);
        
       }
       return c;
    }
    
    public int contarCoches(){
        return coches.size();
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
    
    public void asignarCoches() throws IOException{
        Iterator<Piloto> itp = pilotos.iterator();
        int c = 0;
        
        Piloto pa;
        while(itp.hasNext() && c<coches.size()){
         pa = itp.next();
         Coche ca = coches.get(c);
         
         if (!pa.getDescalificado()){
                if(ca.getCombustibleActual() > 0){
                    pa.setCoche(ca);
                    
                }
                
                c++;
            }
            
            
        }
    }
    
  
    public String toString(){
        return "%%%"+getNombre()+"%%%";
    }
    
    public void mostrarCadaEscuderia() throws IOException{
        String chain;
        
        ArrayList<Piloto> pilotos=getPilotos();
        for(Piloto piloto : pilotos)
        {
            chain = piloto.toString();
            print(chain);            
        }
        
        ArrayList<Coche> coches=getCoches();
        for(Coche coche : coches)
        {
            chain = coche.toString();
            print(chain);                
        }
    }
    
}
