import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.io.*;
/**
 * Clase para inciar los datos de la simulacion del campeonato completo
 * 
 * @author Manuel Rodriguez Rodriguez
 * @version 20/21
 */
public class DatosCampeonatoCompleto
{

    public DatosCampeonatoCompleto()throws IOException{   
        LogFile lg = LogFile.getInstance();
        
        lg.write("*********************************************************************************************************");
        lg.write("*****************ESTA SIMULACIÓN CONCLUYE NORMALMENTE COMPLETÁNDOSE TODAS LAS CARRERAS*******************");        
        lg.write("*********************************************************************************************************\n");

        initData();
    }

    /**
     * Metodo que inicializa las variables de la Organizacion
     * 
     * @param (no params needed)
     * @return (nothing)
     */
    private void initData() throws IOException{
            Organizacion org = Organizacion.getInstance(new ComparatorDistanciaDesc());
            
            org.setLimiteAbandonos(3);
            org.setLimitePilotos(2);
            
            
            //creacion circuitos
            
            Circuito Australia = new CirImpl ("Australia", Complejidad.BAJA, Distancia.LARGA);
            Circuito ausG = new Gravilla ("ausG", Complejidad.BAJA, Distancia.LARGA, Australia);
            org.nuevoCircuito(Australia);
            
            
            Circuito Chile = new CirImpl ("Chile", Complejidad.ALTA, Distancia.CORTA);
            Circuito chiG = new Gravilla ("chiG", Complejidad.ALTA, Distancia.CORTA, Chile);
            org.nuevoCircuito(Chile);
             
            Circuito Alemania = new CirImpl ("Alemania", Complejidad.MEDIA, Distancia.INTERMEDIA);
            Circuito mojA = new Mojado ("mojA", Complejidad.MEDIA, Distancia.INTERMEDIA, Alemania);
            org.nuevoCircuito(Alemania);
            
            
            Circuito Portugal = new CirImpl ("Portugal", Complejidad.MEDIA, Distancia.INTERMEDIA);
            Circuito porG = new Gravilla ("porG", Complejidad.MEDIA, Distancia.INTERMEDIA, Portugal);
            Circuito porN = new Nocturno ("porN", Complejidad.MEDIA, Distancia.INTERMEDIA, Portugal);
            org.nuevoCircuito(Portugal);
            
            
            Circuito Corcega = new CirImpl ("Corcega", Complejidad.MEDIA, Distancia.INTERMEDIA);
            Circuito corN = new Nocturno ("corN", Complejidad.MEDIA, Distancia.INTERMEDIA, Corcega);
            Circuito corG = new Gravilla ("corG", Complejidad.MEDIA, Distancia.INTERMEDIA, Corcega);
            org.nuevoCircuito(Corcega);
            
            Circuito Cerdena = new CirImpl ("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
            Circuito cerG = new Gravilla ("cerG", Complejidad.ALTA, Distancia.CORTA, Cerdena);
            Circuito cerM = new Mojado ("cerM", Complejidad.ALTA, Distancia.CORTA, Cerdena);
            org.nuevoCircuito(Cerdena);
            
            Circuito Finlandia = new CirImpl ("Finlandia", Complejidad.ALTA, Distancia.CORTA);
            Circuito finN = new Nocturno ("finN", Complejidad.ALTA, Distancia.CORTA, Finlandia);
            Circuito finF = new Frio ("finF", Complejidad.ALTA, Distancia.CORTA, Finlandia);
            Circuito mojN = new Mojado ("finM", Complejidad.ALTA, Distancia.CORTA, Finlandia);
            org.nuevoCircuito(Finlandia);
           
            
            
            //creacion escuderias
            
            
            Escuderia Citroen = new Escuderia("Citroen", new ComparadorPuntosDesc(), new ComparadorCombustibleDesc());
            
            Escuderia Peugeot = new Escuderia("Peugeot", new ComparadorPuntosAsc(), new ComparadorCombustibleAsc());
            
            Escuderia Seat = new Escuderia("Seat", new ComparadorPuntosAsc(), new ComparadorCombustibleAsc());
            
            
            org.nuevaEscudería(Seat);
            org.nuevaEscudería(Peugeot);
            org.nuevaEscudería(Citroen);
            
            
            
            //ceracion coches y pilotos
            Seat.nuevoCoche(new CocheResistente("Seat Tarraco", Velocidad.TORTUGA, Combustible.GENEROSO));
            Seat.nuevoCoche(new CocheRapido("Seat Ateca", Velocidad.GUEPARDO, Combustible.GENEROSO));
            Seat.nuevoCoche(new CocheNormal("Seat Arona", Velocidad.RAPIDA, Combustible.ESCASO));
            
            Seat.nuevoPiloto(new PilotoExperimentado("Ogier", Concentracion.NORMAL));
            Seat.nuevoPiloto(new PilotoEstrella("McRae", Concentracion.CONCENTRADO));
            Seat.nuevoPiloto(new PilotoNovato("Blomquist", Concentracion.DESPISTADO));
            Seat.ordenarPilotos(Seat.getMgp());
            Seat.ordenarCoches(Seat.getMgc());
            Seat.asignarCoches();
            
            Peugeot.nuevoCoche(new CocheResistente("Peugeot 5008", Velocidad.LENTA, Combustible.GENEROSO));
            Peugeot.nuevoCoche(new CocheRapido("Peugeot 3008", Velocidad.GUEPARDO, Combustible.NORMAL));
            Peugeot.nuevoCoche(new CocheNormal("Peugeot 2008", Velocidad.NORMAL, Combustible.ESCASO));
            
            Peugeot.nuevoPiloto(new PilotoExperimentado("Kakunnen", Concentracion.CONCENTRADO));
            Peugeot.nuevoPiloto(new PilotoEstrella("Sainz", Concentracion.ZEN));
            Peugeot.nuevoPiloto(new PilotoNovato("Sordo", Concentracion.DESPISTADO));
            Peugeot.ordenarPilotos(Peugeot.getMgp());
            Peugeot.ordenarCoches(Peugeot.getMgc());
            Peugeot.asignarCoches();
            
            
            Citroen.nuevoCoche(new CocheResistente("citroen c5", Velocidad.RAPIDA, Combustible.ELEFANTE));
            Citroen.nuevoCoche(new CocheRapido("citroen c4", Velocidad.RAPIDA, Combustible.ESCASO));
            Citroen.nuevoCoche(new CocheNormal("citroen c3", Velocidad.RAPIDA, Combustible.ESCASO));
            
            Citroen.nuevoPiloto(new PilotoExperimentado("Loeb", Concentracion.NORMAL));
            Citroen.nuevoPiloto(new PilotoEstrella("Makinen", Concentracion.ZEN));
            Citroen.nuevoPiloto(new PilotoNovato("Auriol", Concentracion.NORMAL));
            Citroen.ordenarPilotos(Citroen.getMgp());
            Citroen.ordenarCoches(Citroen.getMgc());
            Citroen.asignarCoches();
            

            
            
            
            
            
    }
}
