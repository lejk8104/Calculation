

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Calculation_r02_2Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Calculation_r02_2Test
{
    Calculation_r02_2 calc;
    /**
     * Default constructor for test class Calculation_r02_2Test
     */
    public Calculation_r02_2Test()
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
         calc = new Calculation_r02_2();
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

    @Test
    public void min_test()
    {
        Calculation_r02_2 calculat1 = new Calculation_r02_2();
        assertEquals(12, calculat1.min(12, 16));
        assertEquals(0, calculat1.min(0, 15));
        assertEquals(-100, calculat1.min(-15, -100));
    }

    @Test
    public void isValidPosition_test()
    {
        Calculation_r02_2 calculat1 = new Calculation_r02_2();
        assertEquals(true, calculat1.isValidPosition(60, 60, 80));
        assertEquals(true, calculat1.isValidPosition(-80, -80, -60));
    }
}




