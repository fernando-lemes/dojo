import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class for {@link MathExpressionEvaluator}.
 */
public class MathExpressionEvaluatorTest {

    private MathExpressionEvaluator evaluator;

    @Before
    public void setup(){
        this.evaluator = new MathExpressionImpl();

    }

    @Test
    public void evaluate_withSingleNumber_shouldReturnZero() {
        assertEquals(0, evaluator.evaluate("0+0"));
    }


    @Test
    public void evaluate_withSingleNumber_shouldReturnSum() {
        assertEquals(243, evaluator.evaluate("11+232"));
    }

    @Test
    public void evaluate_withSingleNumber_shouldReturnSub() {
        assertEquals(1000001229, evaluator.evaluate("1000001230-1"));
    }

    @Test
    public void evaluate_withSingleNumber_shouldReturnMultiplier() {
        assertEquals(8, evaluator.evaluate("2*4"));
    }

    @Test
    public void evaluate_withSingleNumber_shouldReturnDivision() {
        assertEquals(2, evaluator.evaluate("6/3"));
    }

    @Test
    public void evaluate_withParentesis_shouldReturnSumWithParenthesis() {
        assertEquals(13, evaluator.evaluate("(4+9)"));
    }


}
