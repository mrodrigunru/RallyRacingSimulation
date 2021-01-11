

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
public class GravillaTest
{
    private Circuito circuito;
    private Circuito circuitoGrav;
    private Complejidad complejidad;
    private Distancia distancia;
    /**
     * Default constructor for test class GravillaTest
     */
    public GravillaTest()
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
        circuitoGrav = new Gravilla("CIRCUITO", complejidad.BAJA, distancia.CORTA, circuito);
    }
    
    @Test
    public void testSetAndGetComplejidadActual()
    {
        assertEquals(1.05, circuitoGrav.getComplejidadActual(),0);
    }
    
    @Test
    public void testSetAndGetDistanciaActual()
    {
        assertEquals(237.5, circuitoGrav.getDistanciaActual(),0);
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