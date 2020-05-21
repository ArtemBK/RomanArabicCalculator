import java.util.*;

public class RomanArabicConverter {

    private TreeMap<Integer, String> map =
            new TreeMap<>(Comparator.reverseOrder());

    private void mapInit(){
        this.map.put(100, "C");
        this.map.put(90, "XC");
        this.map.put(50, "L");
        this.map.put(40, "XL");
        this.map.put(10, "X");
        this.map.put(9, "IX");
        this.map.put(5, "V");
        this.map.put(4, "IV");
        this.map.put(1, "I");
    }

    public RomanArabicConverter(){
        mapInit();
    }

    public String arabicToRoman(int arabicNumber){
        String result = "";
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (arabicNumber >= entry.getKey()){
                result += entry.getValue();
                arabicNumber -= entry.getKey();
            }
        }
        return result;
    }


    public int romanToArabic(String romanNumber){
        romanNumber = romanNumber.toUpperCase();
        int result = 0;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (romanNumber.startsWith(entry.getValue())){
                int count = 0;
                result += entry.getKey();
                count += entry.getValue().length();
                romanNumber = romanNumber.substring(count);
            }
        }

        return result;
    }

}
