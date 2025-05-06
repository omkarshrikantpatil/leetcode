public class LeetCode2011 {
    public static int returnSum(String [] operations){
        int x = 0;
        for(String op: operations){
            if(op.contains("-")) x--;
            else x++;
        }
        return x;
    }
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(returnSum(operations));
    }
}
