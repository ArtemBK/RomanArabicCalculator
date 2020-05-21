import CalcExceptions.IncorrectInputFormat;
import CalcExceptions.InvalidArgumentsException;
import CalcExceptions.InvalidArithmeticOperatorException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArithmeticOperator arithmeticOperation = new ArithmeticOperator();
        InputValidator inputValidator = new InputValidator();

        String[] arithmeticExpression = reader.readLine().split(" ");

        String firstOperand;
        String operator;
        String secondOperand;

        if (!inputValidator.isFormatCorrect(arithmeticExpression)) {
            try {
                throw new IncorrectInputFormat("Incorrect input format");
            } catch (IncorrectInputFormat e) {
                e.printStackTrace();
                return;
            }
        } else {
            firstOperand = arithmeticExpression[0];
            operator = arithmeticExpression[1];
            secondOperand = arithmeticExpression[2];
        }

        if (!inputValidator.isOperatorValid(operator)) {
            try {
                throw new InvalidArithmeticOperatorException("Unsupported operation");
            } catch (InvalidArithmeticOperatorException e) {
                e.printStackTrace();
                return;
            }
        }

        if(inputValidator.isRoman(firstOperand, secondOperand)){
            String result = arithmeticOperation.getResult(firstOperand, secondOperand, operator);
            System.out.println(result);
        } else if(inputValidator.isArabic(firstOperand, secondOperand)) {
            int a = Integer.parseInt(firstOperand);
            int b = Integer.parseInt(secondOperand);
            int result = arithmeticOperation.getResult(a, b, operator);
            System.out.println(result);
        } else {
            try {
                throw new InvalidArgumentsException("Wrong arguments");
            } catch (InvalidArgumentsException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}








