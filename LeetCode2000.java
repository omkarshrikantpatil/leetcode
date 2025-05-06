public class LeetCode2000 {
    public static String reverseParticularString(String str, char ch){
        int index = -1;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                index = i;
                break;
            }
        }

        if(index == -1){
            return str;
        }

        StringBuilder reversed = new StringBuilder();
        for(int i=index ; i>=0; i--){
            reversed.append(str.charAt(i));
        }

        reversed.append(str.substring(index + 1));

        return reversed.toString();
    }
    public static void main(String[] args) {

    }
}
