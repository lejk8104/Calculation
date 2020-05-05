

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Calculation2Test.
 *
 * @author (우메모토세이야 2018315056/이재근 2015225129)
 * @version (2020.04.29)
 */
public class Calculation2Test
{
    /**
     * Default constructor for test class Calculation2Test
     */
    public Calculation2Test()
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
        assertEquals(0, Calculation2.findMax(array));
    }

    @Test
    public void Loop2()
    {
        int[] array = new int[1];
        array[0] = 5;
        assertEquals(5, Calculation2.findMax(array));
    }

    @Test
    public void Loop3()
    {
        int[] array = new int[2];
        array[0] = 5;
        array[1] = -2;
        assertEquals(5, Calculation2.findMax(array));
    }

    @Test
    public void Loop4()
    {
        int[] array = new int[2];
        array[0] = 2;
        array[1] = 5;
        assertEquals(5, Calculation2.findMax(array));
    }

    @Test
    public void Loop5()
    {
        int[] array = new int[6];
        array[0] = 5;
        array[1] = -2;
        array[2] = -2;
        array[3] = -4;
        array[4] = 15;
        array[5] = 0;
        assertEquals(15, Calculation2.findMax(array));
    }
}





