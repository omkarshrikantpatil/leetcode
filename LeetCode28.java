public class LeetCode28 {
    public static boolean strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length()-1; i++){
            if(haystack.substring(i, i+needle.length()) == needle){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = strStr("Samruddhi", "hi");
    }
}
