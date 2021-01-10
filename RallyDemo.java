import java.io.*;
/**
 * Write a description of class RallyDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RallyDemo
{
    
    /**
     * Sumula la carrera de Rally entre las escuderias de la organizacion
     */
    public static void main(String[] args) throws IOException
    {
        Organizacion org = Organizacion.getInstance();
        
        
        DatosCampeonatoCompleto initdata = new DatosCampeonatoCompleto();
        //DatosCampeonatoFinPrematuro initdata = new DatosCampeonatoFinPrematuro();
        //DatosCampeonatoPremioDesierto initdata = new DatosCampeonatoPremioDesierto();        
        
         org.competir();
         org.entregaPremios();
    }

    
}
