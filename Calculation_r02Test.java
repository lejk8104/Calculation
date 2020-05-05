

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Calculation_r02Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Calculation_r02Test
{
    /**
     * Default constructor for test class Calculation_r02Test
     */
    public Calculation_r02Test()
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
    public void DecisionCoverage_case1()
    {
        Calculation_r02 calculation1 = new Calculation_r02();
        assertEquals(10, calculation1.min(10, 20));
    }

    @Test
    public void DecisionCoverage_2()
    {
        Calculation_r02 calculation2 = new Calculation_r02();
        assertEquals(-9, calculation2.min(-9, -3));
    }

    @Test
    public void MultipleConditionCoverage_case1()
    {
        Calculation_r02 calculation_1 = new Calculation_r02();
        assertEquals(false, calculation_1.isValidPosition(30, 50, 40));
    }

    @Test
    public void MultipleConditionCoverage_case2()
    {
        Calculation_r02 calculation_2 = new Calculation_r02();
        assertEquals(false, calculation_2.isValidPosition(50, 30, 40));
    }

    @Test
    public void MultipleConditionCoverage_case3()
    {
        Calculation_r02 calculation_3 = new Calculation_r02();
        assertEquals(false, calculation_3.isValidPosition(60, 80, 50));
    }

    @Test
    public void MultipleConditionCoverage_case4()
    {
        Calculation_r02 calculation_4 = new Calculation_r02();
        assertEquals(true, calculation_4.isValidPosition(-60, -80, -50));
    }

    @Test
    public void MultipleConditionCoverage_sample()
    {
        Calculation_r02 calculation = new Calculation_r02();
        assertEquals(true, calculation.isValidPosition(60, 60, 80));
    }
}







