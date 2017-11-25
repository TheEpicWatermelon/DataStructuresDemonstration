import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Uses the stack method with postfix operations to calculate a result
 * @author Sasha Maximovitch
 * @data 10/30/2017
 *
 */
public class StackCalculator {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();

        Stack<Integer> numHolder = new Stack<>();

        String temp = "";
        boolean lastNum = false;

        for(int i = 0; i < expression.length(); i++){
            char currentC = expression.charAt(i);

            if(currentC == ' ' && lastNum){
                numHolder.push(Integer.parseInt(temp));
                temp = "";
                lastNum = false;
            }else if(currentC == ' '){
                continue;
            }else if(currentC == '+' || currentC == '-' || currentC == '*' || currentC == '/'){
                calculate(numHolder, currentC);
            }else{
                temp += currentC;
                lastNum = true;
            }
        }

        System.out.println(numHolder.pop());

    }

    private static void calculate(Stack<Integer> numHolder, char currentC) {
        int num2 = numHolder.pop();
        int num1 = numHolder.pop();
        if(currentC == '+'){
            numHolder.push(num1 + num2);
        } else if(currentC == '-'){
            numHolder.push(num1 - num2);
        } else if(currentC == '*'){
            numHolder.push(num1 * num2);
        } else{
            numHolder.push(num1 / num2);
        }

    }

}