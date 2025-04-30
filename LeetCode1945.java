import java.util.HashMap;

public class LeetCode1945 {
    public static int characterSum(String s, int k){
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(char c = 'a'; c <= 'z'; c++){
//            map.put(c, c - 'a' + 1);
//        }
//        StringBuilder str = new StringBuilder();
//        for(char c : s.toCharArray()){
//            str.append(map.get(c));
//        }
//        String current = str.toString();
//        for(int i=0; i<k; i++){
//            int sum = 0;
//            for(char digit: current.toCharArray()){
//                sum += digit - '0';
//            }
//            current = Integer.toString(sum);
//        }
//        return Integer.parseInt(current);

        //Using another approach
        String numStr = "";
        for(char c: s.toCharArray()){
            int val = c - 'a' + 1;
            numStr += val;
        }

        String current = numStr;
        for(int i=0; i<k; i++){
            int sum = 0;
            for(char digit: current.toCharArray()){
                sum += digit - '0';
            }
            current = Integer.toString(sum);
        }
        return Integer.parseInt(current);
    }
    public static void main(String[] args) {
        int charSum = characterSum("abcd", 2);
        System.out.println(charSum);
    }
}
