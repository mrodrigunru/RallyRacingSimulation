import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
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
    //TODO comparador de coches
    /**
     * Constructor for objects of class Escuderia
     */
    public Escuderia(String nombre, MegaComparadorPilotos mgp)
    {
       nombreEsc = nombre;
       pilotos = new ArrayList<Piloto>();
       this.mgp = mgp;
       coches = new ArrayList<Coche>();
       //comparador coches
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
    
    public void ordenarPilotos(){
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
    public Piloto sacarPiloto(){
        Piloto p = null;
        int i = 0;
        while ( i < pilotos.size()){
            if(pilotos.get(i).getDescalificado() == false){
            p = pilotos.get(i);
        
            }
            else i++;
        }
        
         return p;
    }
    
    public void devolverPiloto(Piloto p1){
        pilotos.add(p1);
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
    
    /**
     * Saca el primer coche de la lista, lo devuelve y lo vuelve a insertar al final
     * 
     * @return el primer coche de la lista
     */
    public Coche sacarCoche(){
        if (!pilotos.isEmpty()){
        Coche c = coches.get(0);
        coches.remove(0);
        coches.add(c);
        return c;
       }
       else return null;
    }
    
    public int contarCoches(){
        return coches.size();
    }
    
    public String toString(){
        return "%%%"+getNombre()+"%%%";
    }
}
