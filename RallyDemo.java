import java.io.*;
/**
 * Write a description of class RallyDemo here.
 * 
 * @author Manuel Rodriguez
 * @version 2.0
 */
public class RallyDemo
{
    
    /**
     * Sumula la carrera de Rally entre las escuderias de la organizacion
     */
    public static void main(String[] args) throws IOException
    {
        
        
        Organizacion org = Organizacion.getInstance(new ComparatorDistanciaDesc());
        DatosCampeonatoCompleto initdata = new DatosCampeonatoCompleto();
        
        //Organizacion org = Organizacion.getInstance(new ComparatorComplejidadDesc());
        //DatosCampeonatoFinPrematuro initdata = new DatosCampeonatoFinPrematuro();
        
        //Organizacion org = Organizacion.getInstance(new ComparatorDistanciaDesc());
        //DatosCampeonatoPremioDesierto initdata = new DatosCampeonatoPremioDesierto();        
         
         org.competir();
         org.entregaPremios();
    }

    
}
