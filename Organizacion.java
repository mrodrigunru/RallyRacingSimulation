import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
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
    private LinkedHashMap<String, Escuderia> escuderias;
    private ArrayList<Piloto> pilotosCarrera;
    private MegaComparadorPilotos mgp;
    private ArrayList<Piloto> descalificados;

    private static Organizacion instance = null;

    /**
     * Constructor for objects of class Organization. Es privado debido al Singleton
     */
    private Organizacion(MegaComparadorCircuitos mgcirc)
    {
        this.limiteAbandonos = 0;
        this.limitePilotos = 0;
        circuitos = new TreeSet<Circuito>(mgcirc);
        escuderias = new LinkedHashMap<String, Escuderia>();
        pilotosCarrera = new  ArrayList<Piloto>();
        descalificados = new ArrayList<Piloto>();

    }

    /**
     * Singleton Pattern. Chequea que solo hay una unica instancia de la clase
     * 
     * @param    (no params needed)
     * @return   La instancia actual de la clase
     */
    public static Organizacion getInstance(MegaComparadorCircuitos megcirc)
    {
        if (instance == null){
            instance = new Organizacion(megcirc);
        }
        return instance;
    }

    /**
     * PRE:{El item debe estar inicializado}
     * 
     * POST:{It sets an instance of Organizacion }
     * 
     * @param instance The instance of Organizacion
     */
    public static void setInstance(Organizacion instance){
        Organizacion.instance = instance;
    }

    /**
     * Metodo que devuelve el limite de abandonos de un piloto
     * 
     * 
     * @return    el limite del abandonos
     */
    public int getLimiteAbandonos()
    {
        return this.limiteAbandonos;
    }

    /**
     * Metodo que devuelve el numero maximo de `pilotos que pueden competir
     * 
     * 
     * @return     limite de pilotos
     */
    public int getLimitePilotos()
    {
        return this.limitePilotos;
    }

    /**
     * Metodo que actualiza el limite de abandonos
     * 
     * @param limA limite de abandonos
     */
    public void setLimiteAbandonos(int limA){
        this.limiteAbandonos = limA;
    }

    /**
     * Metodo que actualiza el limite de pilotos
     * 
     * @param limP limite de pilotos
     */
    public void setLimitePilotos(int limP){
        this.limitePilotos = limP;
    }

    /**
     * Metodo que devuelve el TreeSet que contiene a los circuitos
     * 
     * @return la lista de circuitos
     */
    public TreeSet getCircuitos(){
        return circuitos;
    }

    /**
     * Metodo que añade un nuevo circuito a la lista
     * 
     * @param circuito el circuito a añadir
     */
    public void nuevoCircuito(Circuito circuito){
        circuitos.add(circuito);
    }

    /**
     * Metodo que devuelve el map de las escuderias
     * 
     * @return la lista de escuderias
     */
    public LinkedHashMap getEscuderias(){
        return escuderias;   
    }

    /**
     * Metodo que añade una nueva escuderia a la lista
     * 
     * @param escuderia la escuderia a añadir
     */
    public void nuevaEscudería(Escuderia escuderia){
        escuderias.put(escuderia.getNombre(), escuderia);
    }

    /**
     * Metodo que devuelve la lista de pilotos que hay en la carrera
     * 
     * @return la lista de pilotos
     */
    public ArrayList getPilotosCarrera(){
        return   pilotosCarrera;
    }

    /**
     * Metodo que añade un nuevo piloto a la lista de carrera
     * 
     * @paran el piloto a añadir
     */
    public void nuevoPilotoCarrera(Piloto piloto){
        pilotosCarrera.add(piloto);
    }

    /**
     * Metodo que muestra todas las escuderias del campeonato
     * 
     * @throws IOException
     */
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

    /**
     * Metodo que muestra todos los circuitos del campeonato
     * 
     * @throws IOException 
     */
    public void mostrarCircuitos() throws IOException{
        print("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        print("||||||||||||||||||| CIRCUITOS DEL CAMPEONATO |||||||||||||||||||");
        print("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        for(Circuito circuito : circuitos){
            print(circuito.toString());
        }
    }

    /**
     * Metodo que indica si debe finalizar el campeonato y de que forma
     * 
     * @return la forma en que debe acabar
     */
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
     * Metodo que se encarga de llevar a cabo la competición 
     */
    public void competir() throws IOException{

        boolean fin = false;
        Iterator<Circuito> itc = circuitos.iterator();

        mostrarCircuitos();
        mostrarEscuderias();

        int n = 1;
        while (!fin && itc.hasNext()){

            for(Escuderia escuderia : escuderias.values()){
                int i = 0; 
                int j= 0;
                while (i<getLimitePilotos() && j<escuderia.getPilotos().size()){
                    Piloto p ;
                    p = escuderia.sacarPiloto(j);

                    if( !p.getDescalificado()){
                        pilotosCarrera.add(p);
                        i++;

                    }

                    j++;
                }

            }
            Collections.sort(pilotosCarrera, new ComparadorPuntosCarrerasAsc());

            Circuito circuitoActual = itc.next();
            print("********************************************************************************************************");
            print("*** CARRERA<" + n + "> EN " + circuitoActual.toString());

            for( Piloto piloto : pilotosCarrera){
                if(piloto.getCoche() ==null){
                    pilotosCarrera.remove(piloto);
                    print("¡¡¡ " + piloto.getNombre() + "  NO ES ENVIADO A LA CARRERA porque su escudería no tiene más coches con combustible disponibles !!!");
                }
            }

            print("********************************************************************************************************");
            print("******************************** Pilotos que van a competir en " + circuitoActual.getNombre() + "*******************************");
            print("********************************************************************************************************");

            if(pilotosCarrera.size() <= 1){
                print("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
                print("¡¡¡ No se celebra esta carrera ni la(s) siguiente(s) por no haber pilotos para competir !!!!");
                print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                fin = true;
            }
            
            if (!fin){
                for( Piloto piloto : pilotosCarrera){
                    print ( piloto.toString());
                }
                print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                print("+++++++++++++++++++++++++ Comienza la carrera en "+ circuitoActual.getNombre() +"++++++++++++++++++++++++++");
                print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                Iterator<Piloto> itp = pilotosCarrera.iterator();
                int p = 1;
                while(itp.hasNext()){

                    Piloto pilotoActual = itp.next();
                    if(!pilotoActual.getDescalificado()){
                        Coche coche = pilotoActual.getCoche();

                        print("@@@ Piloto " + p + " de " + pilotosCarrera.size());
                        print(pilotoActual.toString());        
                        print(coche.toString());
                        print("+++ Con estas condiciones es capaz de correr a " + decimals(coche.velocidadReal( pilotoActual.calcularDestreza(), circuitoActual.getComplejidadActual()), 2) + "km/hora +++");

                        pilotoActual.conducir(coche, circuitoActual );
                        if(pilotoActual.getCarrerasAbandonadas() >= getLimiteAbandonos()){
                            print("¡¡¡ "+ pilotoActual.getNombre()+ " es DESCALIFICADO del campeonato por alcanzar el límite de abandonos( "+
                                getLimiteAbandonos() +" ) !!!");

                            pilotoActual.setDescalificado(true);

                        }
                    }
                    p++;
                }

                Collections.sort(pilotosCarrera,new ComparadorTiempoAsc(circuitoActual));
                print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                print("+++++++++++++++++++++++++ Clasificación final de la carrera en "+ circuitoActual.getNombre() +"++++++++++++++++++++++++++");
                print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

                int puntos = 10;
                int i = 1;
                for(Piloto piloto : pilotosCarrera){
                    if (piloto.getTiempoEnCircuito(circuitoActual.getNombre()) > 0 ){
                        piloto.setPuntosEnCircuito (circuitoActual.getNombre(), puntos);
                        piloto.sumarPuntosAcumulados(puntos);
                        print("@@@ Posicion(" + i + "): " + piloto.getNombre() +"- Tiempo: " + decimals(piloto.getTiempoEnCircuito(circuitoActual.getNombre()),2) +
                            "minutos - Puntos: "+ puntos + " @@@");
                        i++;

                        puntos = puntos -2;
                        if(puntos <=2) puntos = 2;
                    }
                    else {
                        piloto.setPuntosEnCircuito (circuitoActual.getNombre(), 0);
                        print("¡¡¡ Ha abandonado "+ piloto.getNombre() +
                            " - Tiempo: "+ decimals(piloto.getTiempoEnCircuito(circuitoActual.getNombre()),2) +
                            " - Puntos: 0 ");

                        if(piloto.getDescalificado()){
                            print("  - Además ha sido descalificado para el resto del Campeonato !!!");
                        }

                    }
                }

                n++;
                pilotosCarrera.clear();

                if (n <=circuitos.size()){

                    for(Escuderia escuderia : escuderias.values()){
                        escuderia.bajarseDelCoche();
                    }
                    for(Escuderia escuderia : escuderias.values()){
                        escuderia.ordenarPilotos(escuderia.getMgp());
                        escuderia.ordenarCoches(escuderia.getMgc());
                        escuderia.asignarCoches();
                    }

                }

            }
        }

    }
    
    /** 
     * Metodo que se encarga de llegar a cabo la entrega de premios del campeonato
     */
    public void entregaPremios() throws IOException{
        print("****************************************************");
        print("**************** FIN DEL CAMPEONATO ****************");
        print("****************************************************");
        print("********** CLASIFICACIÓN FINAL DE PILOTOS **********");
        print("****************************************************");


        for(Escuderia escuderia : escuderias.values()){
            int i = 0;
            while (i<escuderia.contarPilotos()){
                Piloto p = null;
                p = escuderia.sacarPiloto(i);

                if( !p.getDescalificado() ) pilotosCarrera.add(p);
                else descalificados.add(p);
                i++;
            }

        }
        Collections.sort(pilotosCarrera, new ComparadorPuntosDesc());
        Collections.sort(descalificados, new ComparadorPuntosDesc());
        
        if(pilotosCarrera.isEmpty()){
            print("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
            print("¡¡¡ Campeonato de pilotos queda desierto por haber sido descalificados todos los pilotos !!!");
            print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        int pole = 1;
        for(Piloto piloto : pilotosCarrera){

            print("@@@ Posicion(" + pole + "): " + piloto.getNombre() + " - Puntos Totales: " + piloto.getPuntosAcumulados() + " @@@");

            for (Circuito circuito : circuitos){
                if(piloto.getMapResultados().containsKey(circuito.getNombre())){
                    print("Carrera(" + circuito.getNombre() + ") - Puntos: " +piloto.getPuntosEnCircuito(circuito.getNombre()) +
                        " - Tiempo: " + Math.round((piloto.getTiempoEnCircuito(circuito.getNombre()))*100d) / 100d + " minutos");
                }
            }
            pole++;
        }

        Collections.sort(descalificados, new ComparadorPuntosDesc());

        print("****************************************************");
        print("************** PILOTOS DESCALIFICADOS **************");
        print("****************************************************");

        for(Piloto piloto : descalificados){

            print("--- Piloto Descalificado: " + piloto.getNombre() + " - Puntos Totales Anulados: " + piloto.getPuntosAcumulados());
            piloto.anularPuntos();

            for (Circuito circuito : circuitos){
                if(piloto.getMapResultados().containsKey(circuito.getNombre())){
                    print("Carrera(" + circuito.getNombre() + ") - Puntos: " +piloto.getPuntosEnCircuito(circuito.getNombre()) +
                        " - Tiempo: " + 
                        Math.round((piloto.getTiempoEnCircuito(circuito.getNombre()))*100d) / 100d   + " minutos");
                }
            }
        }

        print("****************************************************");
        print("******** CLASIFICACIÓN FINAL DE ESCUDERÍAS *********");
        print("****************************************************");

        ArrayList<Escuderia> clasificacionEsc = new  ArrayList <Escuderia> ();

        for(Escuderia escuderia : escuderias.values()){

            Escuderia e = escuderias.get(escuderia.getNombre());
            clasificacionEsc.add(e);

        }
        Collections.sort(clasificacionEsc, new ComparatorPuntosEsc());

        int pole2 = 1;
        for(Escuderia escuderia : clasificacionEsc){
            if(!escuderia.todosDescalificados()){
                print("@@@ Posicion(" + pole2 +") " + escuderia.getNombre() + " con " + escuderia.totalPuntosEscuderia() + " puntos @@@" );
                print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                escuderia.mostrarCadaEscuderia();
                print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            }
            else {
                print("¡¡¡ Escudería Descalificada: "  + escuderia.getNombre() + " con 0.0 puntos @@@" );
                print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                escuderia.mostrarCadaEscuderia();
                print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            }
        }

    }
}
