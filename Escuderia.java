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
     * 
     * @param nombre Nombre de la escuderia
     * @param mgp comparador de pilotos asociado a la escuderia
     * @param mgc comparador de coches asociado a la escuderia
     */
    public Escuderia(String nombre, MegaComparadorPilotos mgp, MegaComparadorCoches mgc)
    {
        nombreEsc = nombre;
        pilotos = new ArrayList<Piloto>();
        this.mgp = mgp;
        coches = new ArrayList<Coche>();
        this.mgc = mgc;
    }

    /**
     * Metodo que devuelve el comparador de pilotos asociado a la escuderia
     * 
     * @return el comparador de pilotos asociado a la escuderia
     */
    public MegaComparadorPilotos getMgp(){
        return this.mgp;
    }

    /**
     * Metodo que devuelve el comparador de pilotos asociado a la escuderia
     * 
     * @return el comparador de pilotos asociado a la escuderia
     */
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

    /**
     * Metodo que añade un nuevo piloto a la lista
     * 
     * @param piloto el piloto a añadir
     */
    public void nuevoPiloto(Piloto piloto){
        pilotos.add(piloto);

    }

    /**
     * Metodo que oredena la lista de pilotos
     * 
     * @param mgp el comparador por el que se rige la ordenacion
     */
    public void ordenarPilotos(MegaComparadorPilotos mgp){
        Collections.sort(pilotos,mgp);
    }

    /**
     * Metodo que devuelve el nombre de la escuderia
     * 
     * @return nombre de la escuderia
     */
    public String getNombre(){
        return nombreEsc;
    }

    /**
     * Metodo que actualiza el nombre de la escuderia
     * 
     * @param nombre nombre de la escuderia
     */
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

    /**
     * Metodo que devuelve el numero de pilotos que hay en la lista
     * 
     * @return valor de tamaño de la lista de pilotos
     */
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

    /**
     * Metodo que añade un coche a la lista de coches
     * 
     * @param coche el coche a añadir
     */
    public void nuevoCoche(Coche coche){
        coches.add(coche);
    }

    /**
     * Metodo que ordena la lista de coches 
     * 
     * @param mgc comparador por el cual se rige la ordenacion
     */
    public void ordenarCoches(MegaComparadorCoches mgc){
        Collections.sort(coches,mgc);
    }

    /**
     * Metodo que calcula el total de puntos de una escuderia
     * 
     * @return total de puntos acumulasdos
     */
    public int totalPuntosEscuderia(){
        int total = 0;
        for( Piloto piloto : pilotos){
            total = total + piloto.getPuntosAcumulados();
        }
        return total;
    }

    /**
     * Metodo que calcula si todos los pilotos de una escuderia han sido descalificados
     * 
     * @return codicion de descalificacion 
     */
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

    /**
     * Metodo que cuenta cuantos coches hay en la lista de coches
     * 
     * @return tamaño de la lista de coches
     */
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

    /**
     * Metodo que asigna coches a los pilotos de un escuderia
     * 
     * @throws IOException
     */
    public void asignarCoches() throws IOException{
        Iterator<Piloto> itp = pilotos.iterator();
        int c = 0;
        boolean asigned = false;
        Piloto pa;
        while(itp.hasNext() && c<coches.size()){

            pa = itp.next();
            Coche ca = coches.get(c);         
            if (!pa.getDescalificado()){
                while (!asigned && c<coches.size()) {

                    if(ca.getCombustibleActual() > 0){
                        pa.setCoche(ca);
                        asigned = true;
                        c++;
                    }
                    else{
                        c++;
                        if (c<coches.size()){
                            ca = coches.get(c);  
                        }
                        
                    }

                }

            }
            asigned = false;
        }
    }

    /**
     * Metodo que desasigna los coches de los pilotos
     */
    public void bajarseDelCoche(){
        for(Piloto piloto : pilotos){
            piloto.setCoche(null);
        }
    }

    /**
     * Metodo que imprime las caracteristicas de la escuderia
     */
    public String toString(){
        return "%%%"+getNombre()+"%%%";
    }

    /**
     * Metodo que muestra los componentes de la escuderia
     */
    public void mostrarCadaEscuderia() throws IOException{
        String chain;

        
        for(Piloto piloto : pilotos)
        {
            chain = piloto.toString();
            print(chain);            
        }

        
        for(Coche coche : coches)
        {
            chain = coche.toString();
            print(chain);                
        }
    }

}
