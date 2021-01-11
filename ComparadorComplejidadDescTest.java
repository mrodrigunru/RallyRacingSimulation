
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
public class ComparadorComplejidadDescTest
{
    private Circuito circuito;
    private Circuito c1;
    private Circuito c2;
    private Circuito c3;
    private MegaComparadorCircuitos mgc;
    private Complejidad complejidad;
    private Distancia distancia;
    /**
     * Default constructor for test class ComparadorPuntosAscTest
     */
    public ComparadorComplejidadDescTest()
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
        c1 = new CirImpl("Asia", complejidad.ALTA, distancia.LARGA);
        c2 = new CirImpl("España", complejidad.BAJA, distancia.CORTA);
        c3 = new CirImpl("Washintong", complejidad.BAJA, distancia.CORTA);
        mgc = new ComparatorComplejidadDesc();
    }
    
    @Test
    public void testMayor()
    {
        int comparacion = mgc.compare(c1,c2);
        assertEquals(1,comparacion);
    }

    @Test
    public void testMenor()
    {
        int comparacion = mgc.compare(c2,c1);
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
