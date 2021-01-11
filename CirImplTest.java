

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
public class CirImplTest
{
    private Circuito circuito;
    private Complejidad complejidad;
    private Distancia distancia;
    /**
     * Default constructor for test class NocturnoTest
     */
    public CirImplTest()
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
    }
    
    @Test
    public void testSetAndGetNombre()
    {
        circuito.setNombre("C1");
        assertEquals("C1", circuito.getNombre());
    }
    
    @Test
    public void testSetAndGetComplejidadOriginal()
    {
        circuito.setComplejidadOriginal(complejidad.MEDIA);
        assertEquals(complejidad.MEDIA, circuito.getComplejidadOriginal());
    }
    
    @Test
    public void testSetAndGetComplejidadActual()
    {
        circuito.setComplejidadActual(1.5);
        assertEquals(1.5, circuito.getComplejidadActual(),0);
    }
    
    @Test
    public void testSetAndGetDistanciaOriginal()
    {
        circuito.setDistanciaOriginal(distancia.LARGA);
        assertEquals(distancia.LARGA, circuito.getDistanciaOriginal());
    }
    
    @Test
    public void testGeValortDistanciaOriginal()
    {
        circuito.setDistanciaOriginal(distancia.LARGA);
        assertEquals(300.0, circuito.getValorDistanciaOriginal(),0);
    }
    
    @Test
    public void testSetAndGetDistanciaActual()
    {
        circuito.setDistanciaActual(1.5);
        assertEquals(1.5, circuito.getDistanciaActual(),0);
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
