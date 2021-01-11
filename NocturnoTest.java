

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NocturnoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NocturnoTest
{
    private Circuito circuito;
    private Circuito circuitoNoc;
    private Complejidad complejidad;
    private Distancia distancia;
    /**
     * Default constructor for test class NocturnoTest
     */
    public NocturnoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        circuito = new CirImpl("CIRCUITO", complejidad.BAJA, distancia.CORTA);
        circuitoNoc = new Nocturno("CIRCUITO", complejidad.BAJA, distancia.CORTA, circuito);
    }
   
    
    @Test
    public void testSetAndGetComplejidadActualNocturno()
    {
        assertEquals(1.2, circuitoNoc.getComplejidadActual(),0);
    }
    
    @Test
    public void testSetAndGetDistanciaActualNocturno()
    {
        assertEquals(200, circuitoNoc.getDistanciaActual(),0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
