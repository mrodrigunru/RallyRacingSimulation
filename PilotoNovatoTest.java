

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PilotoNovatoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PilotoNovatoTest
{
    private Piloto piloto;
    private Concentracion concentracion;
    private Coche coche;
    /**
     * Default constructor for test class PilotoNovatoTest
     */
    public PilotoNovatoTest()
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
        piloto = new PilotoNovato("PILOTO", concentracion.NORMAL);
        piloto.crearEntradaResultados("RESULTADOS", 0.0, 0.0);
    }
    
    @Test
    public void testSetAndGetNombre()
    {
        piloto.setNombre("PILOTO");
        assertEquals("PILOTO", piloto.getNombre());
    }

    @Test
    public void testGetValorConcentracion()
    {
        assertEquals(100.0, piloto.getValorConcentracion(),0);
    }
    
    @Test
    public void testSetGetConcentracion()
    {
        piloto.setConcentracion(concentracion.NORMAL);
        assertEquals(concentracion.NORMAL, piloto.getConcentracion());
    }
    
    @Test
    public void testSetGetCoche()
    {
        piloto.setCoche(coche);
        assertEquals(coche, piloto.getCoche());
    }
    
    @Test
    public void testSetAndGetTiempoEnCircuito()
    {
        piloto.setTiempoEnCircuito("CIRCUITO", 25.0);
        assertEquals(25.0, piloto.getTiempoEnCircuito("CIRCUITO"),0);
    }
    
    @Test
    public void testSetAndGetPuntosEnCircuito()
    {
        piloto.setPuntosEnCircuito("CIRCUITO", 25.0);
        assertEquals(25.0, piloto.getPuntosEnCircuito("CIRCUITO"),0);
    }
    
    @Test
    public void testSumarAndGetPuntosAcumulados()
    {
        assertEquals(0, piloto.getPuntosAcumulados(),0);
        piloto.sumarPuntosAcumulados(25);
        assertEquals(25, piloto.getPuntosAcumulados(),0);
    }
    
    @Test
    public void testSumarAndGetParticipacionEnCarreras()
    {
        assertEquals(0, piloto.getParticipacionEnCarreras(),0);
        piloto.sumarUnaParticipacionEnCarreras();
        assertEquals(1, piloto.getParticipacionEnCarreras(),0);
    }
    
    @Test
    public void testSumarAndGetCarrerasTerminadas()
    {
        assertEquals(0, piloto.getCarrerasTerminadas(),0);
        piloto.sumarUnaCarrerasTerminadas();
        assertEquals(1, piloto.getCarrerasTerminadas(),0);
    }
    
    @Test
    public void testSumarAndGetCarrerasAbandonadas()
    {
        assertEquals(0, piloto.getCarrerasAbandonadas(),0);
        piloto.sumarUnaCarrerasAbandonadas();
        assertEquals(1, piloto.getCarrerasAbandonadas(),0);
    }
    
    @Test
    public void testSetAndGetDescalificado()
    {
        piloto.setDescalificado(false);
        assertEquals(false, piloto.getDescalificado());
    }
    
    @Test
    public void testSetAndGetDestreza()
    {
        piloto.setDestreza(25.0);
        assertEquals(25.0, piloto.getDestreza(),0);
    }
    
    @Test
    public void testCalcularDestreza()
    {
        piloto.setConcentracion(concentracion.ZEN);
        assertEquals(0.94, piloto.calcularDestreza(),0);
    }
    
    @Test
    public void testGetTipoPiloto()
    {
        assertEquals("PilotoNovato", piloto.getTipoPiloto());
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
