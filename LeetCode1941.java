import java.util.HashMap;

public class LeetCode1941 {
    public static boolean checkCount(String myString){
        HashMap<Character, Integer> mapCounts = new HashMap<>();
        for(char c: myString.toCharArray()){
            mapCounts.put(c, mapCounts.getOrDefault(c, 0) + 1);
        }
        int frequency = mapCounts.values().iterator().next();
        for(int count: mapCounts.values()){
            if(count != frequency){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
