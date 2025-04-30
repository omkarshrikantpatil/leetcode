public class LeetCode1967 {
    //using inbuild java method
//    public static int countSubstrings(String[] patterns, String word){
//        int count = 0;
//        for(String pattern : patterns){
//            if(word.contains(pattern)) count++;
//        }
//        return count;
//    }

    //manually by implementing logic
    public static int countSubstrings(String[] patterns, String word){
        int count = 0;
        for(String pattern: patterns){
            if(isSubstring(pattern, word)){
                count++;
            }
        }
        return count;
    }
    public static boolean isSubstring(String pattern, String word){
        int wordLen = word.length();
        int patternLen = pattern.length();
        for(int i=0; i<= wordLen - patternLen; i++){
            if(word.substring(i, i+patternLen).equals(pattern)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] myArray = {"abc", "abc", "os", "bc"};
        System.out.println(countSubstrings(myArray, "abc"));
    }
}
