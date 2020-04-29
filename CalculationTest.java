

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculationTest
{
    /**
     * Default constructor for test class CalculationTest
     */
    public CalculationTest()
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
    public void Loop1()
    {
        int[] array = new int[0];
        assertEquals(0, Calculation.findMax(array));
    }
    
    @Test
    public void Loop2()
    {
        int[] array = new int[1];
        array[0] = 5;
        assertEquals(5, Calculation.findMax(array));
    }

    @Test
    public void Loop3()     //case 
    {
        int[] array = new int[2];
        array[0] = 5;
        array[1] = -2;
        assertEquals(5, Calculation.findMax(array));
    }
    
    @Test
    public void Loop4()    //not working?
    {
        int[] array = new int[2];
        array[0] = 5;
        array[1] = -2;
        assertEquals(5, Calculation.findMax(array));
    }
    
    public void Loop5()     //case n-1
    {
        int[] array = new int[4];
        array[0] = 5;
        array[1] = -2;
        array[2] = 4;
        array[3] = 12;
        assertEquals(12, Calculation.findMax(array));
    }
    
    public void Loop6()     //case n+1
    {
        int[] array = new int[6];
        array[0] = 5;
        array[1] = -2;
        array[2] = -2;
        array[3] = -4;
        array[4] = 15;
        assertEquals(15, Calculation.findMax(array));
    }
    
}
