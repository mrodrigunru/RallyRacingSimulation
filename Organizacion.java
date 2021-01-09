import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Comparator;
import java.io.*;
import java.util.Iterator;
import java.util.Collections;
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
     * A comparator of the energy points 
     */
    public class ComparadorNombreAsc implements Comparator<Piloto>
    {

        public int compare (Piloto c1, Piloto c2){
            int i =0;

            if (c1.getNombre().compareTo(c2.getNombre()) < 0) i = -1;
            if (c1.getNombre().compareTo(c2.getNombre()) > 0) i = 1;

            return i;
        }
    }

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
     * PRE:{El item debe estar inicializado}
     * 
     * POST:{It sets an instance of Hogwarts}
     * 
     * @param instance The instance of Hogwarts
     */
    public static void setInstance(Organizacion instance){
        Organizacion.instance = instance;
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

    public void mostrarCircuitos() throws IOException{
        print("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        print("||||||||||||||||||| CIRCUITOS DEL CAMPEONATO |||||||||||||||||||");
        print("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        for(Circuito circuito : circuitos){
            print(circuito.toString());
        }
    }

    public int condicionFinalizacion(){
        int fin = -1;
        int disponible = 0;

        for(Escuderia escuderia : escuderias.values()){
            for (Piloto piloto : pilotosCarrera){
                if (piloto.getDescalificado() != false) {
                    disponible++;
                }
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

    public void competir() throws IOException{

        boolean fin = false;
        while(!fin){
            Iterator<Circuito> itc = circuitos.iterator();
            int n = 1;
            while (itc.hasNext()){

                for(Escuderia escuderia : escuderias.values()){
                    int i = 0;
                    while (i<getLimitePilotos()){
                        Piloto p = null;
                        p = escuderia.sacarPiloto(i);

                        if( p != null)pilotosCarrera.add(p);

                        i++;
                    }

                }
                Collections.sort(pilotosCarrera, new ComparadorNombreAsc());

                Circuito circuitoActual = itc.next();
                print("********************************************************************************************************");
                print("*** CARRERA<" + n + "> EN " + circuitoActual.toString());

                print("********************************************************************************************************");
                print("******************************** Pilotos que van a competir en" + circuitoActual.getNombre() + "*******************************");
                print("********************************************************************************************************");

                if(pilotosCarrera.size() <= 1){
                    print("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
                    print("¡¡¡ No se celebra esta carrera ni la(s) siguiente(s) por no haber pilotos para competir !!!!");
                    print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    fin = true;
                }

                for( Piloto piloto : pilotosCarrera){
                    print ( piloto.toString());
                }

                Iterator<Piloto> itp = pilotosCarrera.iterator();
                int p = 1;
                while(itp.hasNext()){

                    Piloto pilotoActual = itp.next();
                    if(!pilotoActual.getDescalificado()){
                        Coche coche = pilotoActual.getCoche();
                        print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        print("+++++++++++++++++++++++++ Comienza la carrera en"+ circuitoActual.getNombre() +"++++++++++++++++++++++++++");
                        print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

                        print("@@@ Piloto" + p + "de " + pilotosCarrera.size());

                        print(pilotoActual.toString());        
                        print(coche.toString());
                        print("+++ Con estas condiciones es capaz de correr a" + coche.velocidadReal( pilotoActual.calcularDestreza(), circuitoActual.getComplejidadActual()) + "km/hora +++");

                        if (coche.getTipo().equals("CocheRapido")){
                            int usado = 80 - coche.getMod();
                            print("+++ El nombreCoche usa "+ usado +" de nitro para alcanzar"+
                                coche.velocidadReal( pilotoActual.calcularDestreza(), circuitoActual.getComplejidadActual()) +" km/hora y el nitro restante es"+
                                coche.getMod() +"+++");
                        }

                        pilotoActual.conducir(coche, circuitoActual );

                        if(pilotoActual.getCarrerasAbandonadas() >= getLimiteAbandonos()){

                            print("¡¡¡ "+ pilotoActual.getNombre()+ " es DESCALIFICADO del campeonato por alcanzar el límite de abandonos( "+
                                getLimiteAbandonos() +" ) !!!");

                            pilotoActual.setDescalificado(true);

                        }
                    }
                    p++;
                }
                Collections.sort(pilotosCarrera,new ComparadorPuntosDesc());
                print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                print("+++++++++++++++++++++++++ Clasificación final de la carrera en "+ circuitoActual.getNombre() +"++++++++++++++++++++++++++");
                print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

                int puntos = 10;
                int i = 1;
                for(Piloto piloto : pilotosCarrera){
                    if (piloto.getDescalificado() == false){
                        piloto.setPuntosEnCircuito (circuitoActual.getNombre(), puntos);
                        piloto.sumarPuntosAcumulados(puntos);
                        print("@@@ Posicion(" + i + "): " + piloto.getNombre() +"- Tiempo: " + piloto.getTiempoEnCircuito(circuitoActual.getNombre()) +
                            "minutos - Puntos: "+ puntos + " @@@");
                        i++;
                        
                        puntos = puntos -2;
                        if(puntos <=2) puntos = 2;
                    }
                    else {
                        piloto.setPuntosEnCircuito (circuitoActual.getNombre(), 0);
                        print("¡¡¡ Ha abandonado "+ piloto.getNombre() +
                            " - Tiempo: "+ piloto.getTiempoEnCircuito(circuitoActual.getNombre()) +
                            " - Puntos: 0 ");

                        if(piloto.getDescalificado()){
                            print("  - Además ha sido descalificado para el resto del Campeonato !!!");
                            pilotosCarrera.remove(i);
                        }
                        i++;
                    }
                }

                n++;
                pilotosCarrera.clear();
            }
        }
    }

    
    
}
