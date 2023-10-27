// Second Qustion -->

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "XVIII";
        // Method to Convert Roman Number to Integer
        int result = romanConversion(roman);

        System.out.println("Converted value of roman number " + roman + " is " + result);
    }

    public static int romanConversion(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int preVal = 0;

        for(int i=s.length()-1; i>=0; i--){
            int curr= map.get(s.charAt(i));

            if(curr< preVal){
                result-= curr;
            }else{
                result+= curr;
            }
            preVal = curr;
        }
        return result;
    }
}
