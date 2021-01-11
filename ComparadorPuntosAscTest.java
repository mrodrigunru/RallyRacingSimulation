

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
public class ComparadorPuntosAscTest
{
    private Piloto p1;
    private Piloto p2;
    private Piloto p3;
    private MegaComparadorPilotos mgp;
    private Concentracion concentracion;
    /**
     * Default constructor for test class ComparadorPuntosAscTest
     */
    public ComparadorPuntosAscTest()
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
        p1 = new PilotoNovato("Antonio", concentracion.ZEN);
        p2 = new PilotoNovato("Barbe", concentracion.NORMAL);
        p3 = new PilotoNovato("Zamora", concentracion.NORMAL);
        p1.sumarPuntosAcumulados(25);
        p2.sumarPuntosAcumulados(10);
        p3.sumarPuntosAcumulados(10);
        mgp = new ComparadorPuntosAsc();
    }
    
    @Test
    public void testMayor()
    {
        int comparacion = mgp.compare(p1,p2);
        assertEquals(1,comparacion);
    }

    @Test
    public void testMenor()
    {
        int comparacion = mgp.compare(p2,p1);
        assertEquals(-1,comparacion);
    }

    @Test
    public void testIgual()
    {
        int comparacion = mgp.compare(p2,p3);
        assertEquals(-1,comparacion);
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
