


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OrganizacionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OrganizacionTest
{
    private Escuderia escuderia;
    private MegaComparadorPilotos mgp;
    private MegaComparadorCoches mgc;
    private Circuito circuito;
    private Complejidad complejidad;
    private Distancia distancia;
    private Piloto piloto;
    private Concentracion concentracion;
    /**
     * Default constructor for test class OrganizacionTest
     */
    public OrganizacionTest()
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
        Organizacion organizacion = Organizacion.getInstance(new ComparatorDistanciaDesc());
        mgp = new ComparadorPuntosAsc();
        mgc = new ComparadorCombustibleAsc();
        escuderia = new Escuderia("ESCUDERIA", mgp, mgc);
        circuito = new Nocturno("CIRCUITO", complejidad.BAJA, distancia.CORTA, circuito);
        piloto = new PilotoNovato("PILOTO", concentracion.NORMAL);
    }
    
    @Test
    public void testSetAndGetLimiteAbandonos()
    {
        Organizacion organizacion = Organizacion.getInstance(new ComparatorDistanciaDesc());
        organizacion.setLimiteAbandonos(25);
        assertEquals(25, organizacion.getLimiteAbandonos(),0);
    }
    
    @Test
    public void testSetAndGetLimitePilotos()
    {
        Organizacion organizacion = Organizacion.getInstance(new ComparatorDistanciaDesc());
        organizacion.setLimitePilotos(25);
        assertEquals(25, organizacion.getLimitePilotos(),0);
    }
    
    @Test
    public void testNuevoAndGetCircuitos()
    {
        Organizacion organizacion = Organizacion.getInstance(new ComparatorDistanciaDesc());
        organizacion.nuevoCircuito(circuito);
        assertEquals(circuito, organizacion.getCircuitos().first());
    }
    
    @Test
    public void testNuevoAndGetEscuderias()
    {
        Organizacion organizacion = Organizacion.getInstance(new ComparatorDistanciaDesc());
        organizacion.nuevaEscudería(escuderia);
        assertEquals(escuderia, organizacion.getEscuderias().get(escuderia.getNombre()));
    }
    
    @Test
    public void testNuevoAndGetPilotoCarrera()
    {
        Organizacion organizacion = Organizacion.getInstance(new ComparatorDistanciaDesc());
        organizacion.nuevoPilotoCarrera(piloto);
        assertEquals(piloto, organizacion.getPilotosCarrera().get(0));
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
