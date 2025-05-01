import java.util.Stack;

public class LeetCode67 {
    public static String checkBinary(String a, String b){
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;
            result.append(sum % 2);  // Append 0 or 1 to result
            carry = sum / 2;         // Compute carry

            i--;
            j--;
        }

        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(checkBinary(a, b));
    }
}
