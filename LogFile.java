import java.io.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * The writer of the file output.log
 *  @author Manuel Rodriguez Rodriguez
 * 
 * @version 1.0
 */
public class LogFile {
    private BufferedWriter writer;
    private File file;
    private static LogFile instance = null;
    
    /**
     * It initialise the file to write on
     * 
     * @throws FileNotFoundException if the file if the file is not created
     * 
     * @throws IOException if there is an error in Input/Output operations
     * 
     */
    private LogFile() {
       try
       {
           file = new File ("output.log");
           file.createNewFile();
           writer = new BufferedWriter(new FileWriter(file));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
            System.exit( 1 );
        }
        catch(IOException e)
        {
            System.out.println("something messed up");
            System.exit( 1 );
        }
    }
    
    /**
     * Initialise the instance of LogFile
     * 
     * @return The instance of LogFile
     */
    public static LogFile getInstance() throws IOException {
        if (instance == null) {
            instance = new LogFile();
        }
        return instance;
    }
    
    /**
     * Writes on the file 
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void write (String chain){
        try
       {
           writer.write(chain);
           writer.newLine();
        }
        catch(IOException e)
        {
            System.out.println("something messed up");
            System.exit( 1 );
        }
    }
    
    /**
     * Closes the file
     * 
     * @throws IOExcpetion if there is an error in Input/Output operations
     */
    public void close (){
        try
       {
           writer.flush();
           writer.close();
        }
        catch(IOException e){
            System.out.println("something messed up");
            System.exit( 1 );
        }
    }
}

