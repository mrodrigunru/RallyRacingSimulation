

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CocheNormalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CocheResistenteTest
{
    private CocheResistente coche;
    private Velocidad velocidad;
    private Combustible combustible;
    /**
     * Default constructor for test class CocheNormalTest
     */
    public CocheResistenteTest()
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
        coche = new CocheResistente("c1", velocidad.NORMAL, combustible.NORMAL);
    }
    
    @Test
    public void testSetAndGetNombre()
    {
        coche.setNombre("COCHE");
        assertEquals("COCHE", coche.getNombre());
    }
    
    @Test
    public void testGetValorVelocidad()
    {
        assertEquals(220.0, coche.getValorVelocidad(),0);
    }
    
    @Test
    public void testGetValorCombustible()
    {
        assertEquals(440.0, coche.getValorCombustible(),0);
    }
    
    @Test
    public void testGetAndSetValorCombustibleActual()
    {
        coche.setCombustibleActual(250.0);
        assertEquals(250.0, coche.getCombustibleActual(),0);
    }
    
    
    @Test
    public void testTiempoEnTerminar()
    {
        assertEquals(120.0, coche.tiempoEnTerminar(100.0, 50.0),0);
    }
    
    @Test
    public void testSetAndGetReserva()
    {
        coche.setReserva(25.0);
        assertEquals(25.0, coche.getReserva(),0);
    }
    
    @Test
    public void testGetTipo()
    {
        assertEquals("CocheResistente", coche.getTipo());
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
