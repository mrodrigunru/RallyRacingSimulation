

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComparadorPuntosAscTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ComparadorCombustibleDescTest
{
    private Coche c1;
    private Coche c2;
    private Coche c3;
    private MegaComparadorCoches mgc;
    private Velocidad velocidad;
    private Combustible combustible;
    /**
     * Default constructor for test class ComparadorPuntosAscTest
     */
    public ComparadorCombustibleDescTest()
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
        c1 = new CocheNormal("Azul", velocidad.NORMAL, combustible.ELEFANTE);
        c2 = new CocheNormal("Rojo", velocidad.NORMAL, combustible.NORMAL);
        c3 = new CocheNormal("Violeta", velocidad.NORMAL, combustible.NORMAL);
        mgc = new ComparadorCombustibleDesc();
    }
    
    @Test
    public void testMayor()
    {
        int comparacion = mgc.compare(c1,c2);
        assertEquals(-1,comparacion);
    }

    @Test
    public void testMenor()
    {
        int comparacion = mgc.compare(c2,c1);
        assertEquals(1,comparacion);
    }

    @Test
    public void testIgual()
    {
        int comparacion = mgc.compare(c2,c3);
        assertEquals(1,comparacion);
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
