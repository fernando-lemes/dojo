import java.util.Stack;

public class MathExpressionImpl implements MathExpressionEvaluator{

    private Stack<Integer> numberStack;
    private Stack<Character> operatorStack;
    private int result = 0;

    public MathExpressionImpl(){
        this.numberStack = new Stack<Integer>();
        this.operatorStack = new Stack<Character>();
    }

    public int evaluate(String expression) {


        for(int i = 0; i < expression.length(); i++){
            char value = expression.charAt(i);

            if (value == '(') {
                this.result += this.evaluate(expression.substring(i+1,expression.indexOf(')')));
            }
            if (value >= '0' && value <= '9'){
                int j = i+1;
                    String numbers = "";
                while (j < expression.length() && expression.charAt(j) >= '0' && expression.charAt(j) <= '9' ){
                    numbers  += expression.charAt(j);
                    j++;
                    i++;
                }
                this.numberStack.push(Integer.parseInt(value + numbers));
            }
            if (value == '+' || value == '-') {
                this.operatorStack.push(value);
            }
            if (value == '*' || value == '/') {
                this.operatorStack.push(value);
            }
        }

        return makeTheOperations();
    }


    public int makeTheOperations(){
        return eval(this.numberStack.pop(), this.numberStack.pop(), this.operatorStack.pop());
    }

    private int eval(int numA, int numB, char operator){
        switch(operator){
            case '+': return numB + numA;
            case '-': return numB - numA;
            case '*': return numB * numA;
            case '/': return numB / numA;
            default : return 0;
        }
    }

}
