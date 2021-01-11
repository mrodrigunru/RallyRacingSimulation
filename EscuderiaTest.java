

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The test class EscuderiaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EscuderiaTest
{
    private Piloto p1;
    private Piloto p2;
    private Coche c1;
    private Coche c2;
    private Concentracion concentracion;
    private Velocidad velocidad;
    private Combustible combustible;
    private Escuderia escuderia;
    private MegaComparadorPilotos mgp;
    private MegaComparadorCoches mgc;
    /**
     * Default constructor for test class EscuderiaTest
     */
    public EscuderiaTest()
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
        mgp = new ComparadorPuntosAsc();
        mgc = new ComparadorCombustibleAsc();
        escuderia = new Escuderia("ESCUDERIA",mgp,mgc);
        p1 = new PilotoNovato("Antonio", concentracion.ZEN);
        p2 = new PilotoNovato("Paco", concentracion.NORMAL);
        c1 = new CocheNormal("c1", velocidad.GUEPARDO, combustible.ELEFANTE);
        c2 = new CocheNormal("c1", velocidad.NORMAL, combustible.NORMAL);
    }
    
    @Test
    public void testSetAndGetNombre()
    {
        escuderia.setNombre("F1");
        assertEquals("F1", escuderia.getNombre());
    }
    
    @Test
    public void testNuevoAndSacarPiloto()
    {
        escuderia.nuevoPiloto(p1);
        assertEquals(p1, escuderia.sacarPiloto(0));
    }
    
    
  
    @Test
    public void testContarPilotos()
    {
        escuderia.nuevoPiloto(p1);
        escuderia.nuevoPiloto(p2);
        assertEquals(2, escuderia.contarPilotos(),0);
    }
    
    @Test
    public void testNuevoAndSacarCoche()
    {
        escuderia.nuevoCoche(c1);
        assertEquals(c1, escuderia.sacarCoche(0));
    }
 
 
    @Test
    public void testContarCoches()
    {
        escuderia.nuevoCoche(c1);
        escuderia.nuevoCoche(c2);
        assertEquals(2, escuderia.contarCoches(),0);
    }
    
    @Test
    public void testTotalPuntosEscuderia()
    {
        p1.sumarPuntosAcumulados(7);
        p2.sumarPuntosAcumulados(3);
        escuderia.nuevoPiloto(p1);
        escuderia.nuevoPiloto(p2);
        assertEquals(10, escuderia.totalPuntosEscuderia(),0);
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
