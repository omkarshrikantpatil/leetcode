public class LeetCode2042 {
    public static boolean areNumberAscending(String str){
        String [] myStringArray = str.split(" ");
        int prevNumber = -1;

        for(String token: myStringArray){
            if(isNumber(token)){
                int number = Integer.parseInt(token);
                if(number <= prevNumber){
                    return false;
                }
                prevNumber = number;
            }
        }

        return true;
    }

    private static boolean isNumber(String token){
        if(!token.matches("//d+")) return false;
        return token.equals("0") || !token.startsWith("0");
    }
    public static void main(String[] args) {
        String myString = "I 1 am 2 Omkar Software 3 Engineer";
        System.out.println(areNumberAscending(myString));
    }
}
