import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This is a test class for {@link MathExpressionEvaluator}.
 */
public class MathExpressionEvaluatorTest {

    private MathExpression evaluator = new MathExpression();

    @Test
    public void evaluate_withSingleNumber_shouldReturnTheNumber() {
        assertEquals(0, evaluator.evaluate("0"));
    }

    @Test
    public void evaluate_withAddition_shouldReturnTheResult() {
        assertEquals(5, evaluator.evaluate("2+3"));
    }

    @Test
    public void evaluate_withSubtraction_shouldReturnTheResult() {
        assertEquals(2, evaluator.evaluate("3-1"));
    }

    @Test
    public void evaluate_withMultiplication_shouldReturnTheResult() {
        assertEquals(10, evaluator.evaluate("2*5"));
    }

    @Test
    public void evaluate_withDivision_shouldReturnTheResult() {
        assertEquals(4, evaluator.evaluate("8/2"));
    }

    @Test
    public void evaluate_withTwoOperations_shouldReturnTheResult() {
        assertEquals(5, evaluator.evaluate("3+6/3"));
    }

}
