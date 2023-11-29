

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class uniteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class uniteTest
{
    private ClockTime clockTim1;
    private ClockTime clockTim2;

    

    /**
     * Default constructor for test class uniteTest
     */
    public uniteTest()
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
        clockTim1 = new ClockTime(11, 0, 0);
        clockTim2 = new ClockTime(11, 0, 0);
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
    public void Test1()
    {
        ClockTime clockTim1 = new ClockTime(11, 00, 00);
        ClockTime clockTim2 = new ClockTime(11, 00, 00);
        TestClockTime.printEquals(clockTim1, clockTim2);
    }

    @Test
    public void Test2()
    {
        clockTim1.setHour(11);
        clockTim1.setMinute(0);
        clockTim1.setSecond(0);
        assertEquals("11:00:00", clockTim1.toString12());
        assertEquals("11:00:00", clockTim1.toString());
    }
}


