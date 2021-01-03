import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
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
    //TODO comparador de pilotos
    private ArrayList<Coche> coches;
    //TODO comparador de coches
    /**
     * Constructor for objects of class Escuderia
     */
    public Escuderia(String nombre) //añadir megacomparador al constructor por parametro
    {
       nombreEsc = nombre;
       pilotos = new ArrayList<Piloto>();
       //comparador pilotos
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
        //añadir criterio de ordenacion
    }
    
    public String getNombre(){
        return nombreEsc;
    }
    
    public void setNombre(String nombre){
        this.nombreEsc = nombre;
    }
    
    /**
     * Saca el primer piloto de la lista, lo devuelve y lo vuelve a insertar al final
     * 
     * @return el primer piloto de la lista
     */
    public Piloto sacarPiloto(){
        if (!pilotos.isEmpty()){
        Piloto p = pilotos.get(0);
        pilotos.remove(0);
        pilotos.add(p);
        return p;
       }
       else return null;
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
        //añadir criterio de ordenacion
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
}
