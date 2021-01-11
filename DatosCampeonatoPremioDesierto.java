import java.io.*;
/**
 * Write a description of class DatosCampeonatoFinPrematuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatosCampeonatoPremioDesierto
{
    
    /**
     * Constructor for objects of class DatosCampeonatoFinPrematuro
     */
    public DatosCampeonatoPremioDesierto() throws IOException
    {
        LogFile lg = LogFile.getInstance();
        
        lg.write("*********************************************************************************************************");
        lg.write("*****************ESTA SIMULACIÓN CONCLUYE CONCLYE ANTES DE FINALIZAR EL CAMPEONATO CON TODOS LOS PILOTOS DESCALIFICADOS******************");        
        lg.write("*********************************************************************************************************\n");

        initData3();
    }

        /**
     * Metodo que inicializa las variables de la Organizacion
     * 
     * @param (no params needed)
     * @return (nothing)
     */
    private void initData3() throws IOException{
            Organizacion org = Organizacion.getInstance();
            
            org.setLimiteAbandonos(1);
            org.setLimitePilotos(3);
            
            
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
            Circuito corG = new Gravilla ("corG", Complejidad.MEDIA, Distancia.INTERMEDIA, Corcega);
            Circuito corN = new Nocturno ("corN", Complejidad.MEDIA, Distancia.INTERMEDIA, Corcega);
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
            
            
            Escuderia Citroen = new Escuderia("Citroen", new ComparadorPuntosAsc(), new ComparadorCombustibleAsc());
            
            Escuderia Peugeot = new Escuderia("Peugeot", new ComparadorPuntosDesc(), new ComparadorCombustibleAsc());
            
            Escuderia Seat = new Escuderia("Seat", new ComparadorPuntosDesc(), new ComparadorCombustibleAsc());
            
            
            org.nuevaEscudería(Seat);
            org.nuevaEscudería(Peugeot);
            org.nuevaEscudería(Citroen);
            
            
            
            //ceracion coches y pilotos
            Citroen.nuevoCoche(new CocheResistente("citroen c5", Velocidad.RAPIDA, Combustible.ELEFANTE));
            Citroen.nuevoCoche(new CocheRapido("citroen c4", Velocidad.RAPIDA, Combustible.ESCASO));
            Citroen.nuevoCoche(new CocheNormal("citroen c3", Velocidad.RAPIDA, Combustible.ESCASO));
            
            Citroen.nuevoPiloto(new PilotoExperimentado("Loeb", Concentracion.NORMAL));
            Citroen.nuevoPiloto(new PilotoEstrella("Makinen", Concentracion.ZEN));
            Citroen.nuevoPiloto(new PilotoNovato("Auriol", Concentracion.NORMAL));
            Citroen.ordenarPilotos(new ComparadorPuntosDesc());
            Citroen.ordenarCoches(new ComparadorCombustibleDesc());
            Citroen.asignarCoches();
            
            Seat.nuevoCoche(new CocheResistente("Seat Tarraco", Velocidad.TORTUGA, Combustible.GENEROSO));
            Seat.nuevoCoche(new CocheRapido("Seat Ateca", Velocidad.GUEPARDO, Combustible.GENEROSO));
            Seat.nuevoCoche(new CocheNormal("Seat Arona", Velocidad.RAPIDA, Combustible.ESCASO));
            
            Seat.nuevoPiloto(new PilotoExperimentado("Ogier", Concentracion.NORMAL));
            Seat.nuevoPiloto(new PilotoEstrella("McRae", Concentracion.CONCENTRADO));
            Seat.nuevoPiloto(new PilotoNovato("Blomquist", Concentracion.DESPISTADO));
            Seat.ordenarPilotos(new ComparadorPuntosAsc());
            Seat.ordenarCoches(new ComparadorCombustibleAsc());
            Seat.asignarCoches();
            
            
            Peugeot.nuevoCoche(new CocheResistente("Peugeot 5008", Velocidad.LENTA, Combustible.GENEROSO));
            Peugeot.nuevoCoche(new CocheRapido("Peugeot 3008", Velocidad.GUEPARDO, Combustible.NORMAL));
            Peugeot.nuevoCoche(new CocheNormal("Peugeot 2008", Velocidad.NORMAL, Combustible.ESCASO));
            
            Peugeot.nuevoPiloto(new PilotoExperimentado("Kakunnen", Concentracion.CONCENTRADO));
            Peugeot.nuevoPiloto(new PilotoEstrella("Sainz", Concentracion.ZEN));
            Peugeot.nuevoPiloto(new PilotoNovato("Sordo", Concentracion.DESPISTADO));
            Peugeot.ordenarPilotos(new ComparadorPuntosAsc());
            Peugeot.ordenarCoches(new ComparadorCombustibleAsc());
            Peugeot.asignarCoches();
            
            
    }
}
