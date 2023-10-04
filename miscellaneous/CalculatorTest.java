import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

public class CalculatorTest {
    private Calculator calc;

    @Test
    public void assertAddResult() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.add(4,4));
    }
}
