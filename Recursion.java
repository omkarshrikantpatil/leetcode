public class Recursion {
    //Recursion is a method of solving problems where solution depends on smaller solutions
    //to smaller instances of same problem
    public static void printNtoOne(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printNtoOne(n - 1);
    }

    public static void printOneToN(int n){
        if(n==0){
            return;
        }
        printOneToN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printNtoOne(5);
        System.out.println();
        printOneToN(5);
    }
}
