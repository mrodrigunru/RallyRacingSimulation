import java.util.HashMap;
/**
 * Write a description of class Organizacion here.
 * 
 * @author Manuel Rodriguez && Marcos Santos
 * @version 1.0
 */
public class Organizacion
{
    private HashMap<String, Escuderia> escuderias;
    
    private static Organizacion instance;

    /**
     * Constructor for objects of class Organization. Es privado debido al Singleton
     */
    private Organizacion()
    {
        // implementar constructor organizacion
        
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
}
