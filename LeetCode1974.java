public class LeetCode1974 {
    public static int calculateTime(String myString){
        int time = 0;
        char current = 'a';

        for(char target : myString.toCharArray()){
            int diffrence = Math.abs(current - target);
            int move = Math.min(diffrence, 26 - diffrence);
            int stepTime = move + 1;

            time += stepTime;
            current = target;
        }

        return time;
    }
    public static void main(String[] args) {
        System.out.println(calculateTime("abc"));
    }
}
