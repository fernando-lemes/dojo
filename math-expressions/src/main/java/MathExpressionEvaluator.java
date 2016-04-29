/**
 * This is an evaluator of mathematical expressions.
 */
public interface MathExpressionEvaluator {

    /**
     * Evaluate a simple math expression and return the result.
     *
     * Note: Only expressions with integers are accepted.
     *
     * @param expression the math expression represented as a string.
     * @return the result of the expression.
     */
    public int evaluate(String expression);

}
