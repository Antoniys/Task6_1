
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TestTemperature {
    TemperatureConverter test;
    private static final double DELTA = 0.01;

    @Before
    public void initialize() {
        test = new TemperatureConverter();
    }

    @Test
    public void TestConvertFtoC() {
        assertEquals(20.0, test.convertFtoC(68), DELTA);
    }

    @Test
    public void TestConvertCtoF() {
        assertEquals(50.0, test.convertCtoF(10), DELTA);
    }

    @Test
    public void TestConvertCtoK() {
        assertEquals(300.0, test.convertCtoK(26.8), DELTA);
    }

    @Test
    public void TestConvertKtoC() {
        assertEquals(2.0, test.convertKtoC(275.2), DELTA);
    }

    @Test
    public void TestConvertFtoK() {
        assertEquals(300.0, test.convertFtoK(80.3), DELTA);
    }

    @Test
    public void TestConvertKtoF() {
        assertEquals(8.3, test.convertKtoF(260), DELTA);
    }
}
