import java.util.HashMap;

public class LeetCode13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int currentVal = romanMap.get(s.charAt(i));
            if(i+1 < s.length() && currentVal < romanMap.get(s.charAt(i+1))){
                sum -= currentVal;
            }else{
                sum += currentVal;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = romanToInt("XVII");
        System.out.println(num);
    }
}
