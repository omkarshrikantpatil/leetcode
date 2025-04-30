public class LeetCode1961 {
    public static boolean checkString(String myString, String [] words){
        String newString = "";
        for(String word: words){
            newString += word;
            if(newString.equals(myString)){
                return true;
            }
            if(newString.length() > myString.length()){
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] myWordArray = {"i", "love", "leetu"};
        System.out.println(checkString("iloveleetcode", myWordArray));
    }
}
