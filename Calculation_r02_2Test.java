

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
        assertEquals(2, calc.min(5, 2));
        assertEquals(2, calc.min(2, 5));
    }

    @Test
    public void isValidPosition_test()
    {
        assertEquals(true, calc.isValidPosition(2, 4, 5));       
    }

    @Test
    public void isValidPosition_test2()
    {
        assertEquals(true, calc.isValidPosition(-2, -4, -5));
    }

    @Test
    public void isValidPosition3()
    {
        assertEquals(true, calc.isValidPosition(-2, -4, 5));
    }
}




