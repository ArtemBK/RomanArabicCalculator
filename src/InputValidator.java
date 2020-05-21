import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class InputValidator {

    private Pattern operatorValidator = Pattern.compile("^([+|\\-|*|/])$");
    private Pattern romanValidator = Pattern.compile("^([I]{1,3}||(V|I[V]|V+[I]{1,3})||(X|I[X]))$");
    private Pattern arabicValidator = Pattern.compile("^([1-9]|1[0])$");


    public boolean isFormatCorrect(String[] arithmeticExpression) {
        if(arithmeticExpression.length != 3){
            return false;
        }
        return true;
    }

    public boolean isOperatorValid(String operator){
        Matcher operatorMatcher = this.operatorValidator.matcher(operator);
        if(!operatorMatcher.matches()){
         return false;
        }
        return true;
    }

    public boolean isRoman(String firstOperand, String secondOperand){
        Matcher romanFirst = this.romanValidator.matcher(firstOperand);
        Matcher romanSecond = this.romanValidator.matcher(secondOperand);

        if(romanFirst.matches() && romanSecond.matches()){
            return true;
        }
        return false;
    }

    public boolean isArabic(String firstOperand, String secondOperand){
        Matcher arabicFirst = this.arabicValidator.matcher(firstOperand);
        Matcher arabicSecond = this.arabicValidator.matcher(secondOperand);

        if(arabicFirst.matches() && arabicSecond.matches()){
            return true;
        }
        return false;
    }

}

