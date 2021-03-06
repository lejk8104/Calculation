

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculationTest.
 *
 * @author (우메모토세이야 2018315056/이재근 2015225129)
 * @version (2020.04.29)
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
        array[0] = -555555;
        assertEquals(-555555, Calculation.findMax(array));
    }

    @Test
    public void Loop3()     // not working?
    {
        int[] array = new int[2];
        array[0] = 5;
        array[1] = -2;
        assertEquals(5, Calculation.findMax(array));
    }
    
    @Test
    public void Loop4()    // working... error?
    {
        int[] array = new int[2];
        array[0] = 2;
        array[1] = 5;
        assertEquals(5, Calculation.findMax(array));
    }

    @Test
    public void Loop5()     //case n
    {
        int[] array = new int[6];
        array[0] = 5;
        array[1] = -2;
        array[2] = -2;
        array[3] = -4;
        array[4] = 15;
        array[5] = 0;
        assertEquals(15, Calculation.findMax(array));
    }
}

