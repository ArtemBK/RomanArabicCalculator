public class ArithmeticOperator {
    private int operationDefinition(int firstOperand, int secondOperand, String operator){
        int result = 0;
        switch (operator){
            case "+":
                result = this.add(firstOperand, secondOperand);
                break;
            case "-":
                result = this.subtract(firstOperand, secondOperand);
                break;
            case "*":
                result = this.multiply(firstOperand, secondOperand);
                break;
            case "/":
                result = this.divide(firstOperand, secondOperand);
                break;
        }
        return result;
    }

    private int add(int a, int b){
        return a + b;
    }

    private int subtract(int a, int b){
        return a - b;
    }

    private int multiply(int a, int b){
        return a * b;
    }

    private int divide(int a, int b){
        return a / b;
    }

    public String getResult(String firstOperand, String secondOperand, String operator){
        RomanArabicConverter romanArabicConverter = new RomanArabicConverter();
        int a = romanArabicConverter.romanToArabic(firstOperand);
        int b = romanArabicConverter.romanToArabic(secondOperand);

        int result = this.operationDefinition(a, b, operator);

        return romanArabicConverter.arabicToRoman(result);
    }

    public int getResult(int firstOperand, int secondOperand, String operator) {
        return this.operationDefinition(firstOperand, secondOperand, operator);
    }

}
















