

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
        assertEquals(2, calculat1.min(5, 2));
        assertEquals(2, calculat1.min(2, 5));
    }

    @Test
    public void isValidPosition_test()
    {
        Calculation_r02_2 calculat1 = new Calculation_r02_2();
        assertEquals(true, calculat1.isValidPosition(2, 4, 5));
    }
}


