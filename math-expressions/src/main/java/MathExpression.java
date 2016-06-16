//package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by hanazumi on 29/04/2016.
 */
public class MathExpression implements MathExpressionEvaluator {
    Stack<Integer> numbers;
    Stack<Character> operators;
    List<Character> operatorsList;
    char c;

    MathExpression(){
        numbers = new Stack<Integer>();
        operators = new Stack<Character>();
        operatorsList = new ArrayList<Character>();
        operatorsList.add('*');
        operatorsList.add('/');
        operatorsList.add('-');
        operatorsList.add('+');
    }

    /**
     * Remarks: we consider that an expression does not contains space characters
     * and it is composed only by 0 or more operators and 1 or more numbers of 1 digit.
     *
     * @param expression the math expression represented as a string.
     * @return the expression result
     */
    public int evaluate(String expression) {
        int result = 0;
        for (int i = 0; i < expression.length(); i++) {
            c = expression.charAt(i);
            if (operatorsList.contains(c)) {
                switch (c) {
                    case '*':
                        i++;
                        result = numbers.pop() * Integer.parseInt(String.valueOf(expression.charAt(i)));
                        numbers.push(result);
                        break;
                    case '/':
                        i++;
                        result = numbers.pop() / Integer.parseInt(String.valueOf(expression.charAt(i)));
                        numbers.push(result);
                        break;
                    default:
                        operators.push(c);
                        break;
                }
            } else {
                result = Integer.parseInt(String.valueOf(c));
                numbers.push(result);
            }
        }

        while (!operators.empty()) {
            result = 0;
            c = operators.pop();
            switch (c) {
                case '+':
                    result += numbers.pop() + numbers.pop();
                    break;
                case '-':
                    result += (-numbers.pop()) + numbers.pop();
                    break;
            }
        }
        return result;
    }
}

