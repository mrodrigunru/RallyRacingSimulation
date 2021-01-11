

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
public class FrioTest
{
    private Circuito circuito;
    private Circuito circuitoFrio;
    private Complejidad complejidad;
    private Distancia distancia;
    /**
     * Default constructor for test class FrioTest
     */
    public FrioTest()
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
        circuitoFrio = new Frio("CIRCUITO", complejidad.BAJA, distancia.CORTA, circuito);
    }
    
    @Test
    public void testSetAndGetComplejidadActual()
    {
        assertEquals(1.1, circuitoFrio.getComplejidadActual(),0);
    }
    
    @Test
    public void testSetAndGetDistanciaActual()
    {
        assertEquals(225.0, circuitoFrio.getDistanciaActual(),0);
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