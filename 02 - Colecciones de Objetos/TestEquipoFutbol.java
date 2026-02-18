

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestEquipoFutbol.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestEquipoFutbol
{
    /**
     * Default constructor for test class TestEquipoFutbol
     */
    public TestEquipoFutbol()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestCase01()
    {
        EquipoFutbol equipoFu1 = new EquipoFutbol("Lo Mazacotes de Chicontepec", "Horacio Cascarín");
        assertEquals("Horacio Cascarín", equipoFu1.getEntrenador());
    }

    @Test
    public void TestCase02()
    {
        EquipoFutbol equipoFu1 = new EquipoFutbol("Horacio Cascarín", "Lo Mazacotes de Chicontepec");
        assertEquals(null, equipoFu1.getJugador(3));
    }

    @Test
    public void testCase03()
    {
        EquipoFutbol equipoFu1 = new EquipoFutbol("Los Mazacotes de Chicontepec", "Horacio Cascarín");
        assertEquals("Los Mazacotes de Chicontepec", equipoFu1.getNombre());
    }
}



