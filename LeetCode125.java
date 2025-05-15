public class LeetCode125 {
    public static boolean isValidPalindrome(String str){
        StringBuilder cleaned = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = cleaned.length() - 1;

        while(left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "abcua";
        System.out.println(isValidPalindrome(string));
    }
}
