public class BitManipulation {
    public static String decimalToBinary(int n){
        if(n == 0){
            return "0";
        }
        String res = "";
        while(n > 0){
            int rem = n % 2;
            n /= 2;
            res += rem;
        }
        return new StringBuilder(res).reverse().toString();
    }
    public static int binaryToDecimal(String binary){
        int length = binary.length();
        int res = 0;
        int m = 1;
        for(int i=length-1; i>=0; i--){
            char lastChar = binary.charAt(i);
            Integer lastDigit = Integer.valueOf(String.valueOf(lastChar));
            res = res + m * lastDigit;
            m = m * 2;
        }
        return res;
    }
    public static void main(String[] args) {
        String binary = decimalToBinary(17);
        System.out.println(binary);
        int decimal = binaryToDecimal("10001");
        System.out.println(decimal);
    }

    //  2 | 17 | 1
    //  2 | 8  | 0
    //  2 | 4  | 0
    //  2 | 2  | 0
    //  2 | 1  | 1
}
