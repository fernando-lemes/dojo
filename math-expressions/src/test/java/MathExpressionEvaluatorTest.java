import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * This is a test class for {@link MathExpressionEvaluator}.
 */
public class MathExpressionEvaluatorTest {

    private MathExpressionEvaluator evaluator;

    @Test
    public void evaluate_withSingleNumber_shouldReturnTheNumber() {
        assertEquals(0, evaluator.evaluate("0"));
    }

}
