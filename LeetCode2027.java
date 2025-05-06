public class LeetCode2027 {
    public static int miniumMoves(String s){
        int moves = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'X'){
                moves++;
                i += 3;
            }else{
                i++;
            }
        }
        return moves;
    }
    public static void main(String[] args) {
        System.out.println(miniumMoves("XX0X"));
    }
}
