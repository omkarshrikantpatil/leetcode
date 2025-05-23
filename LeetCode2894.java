//Input: n = 10, m = 3
//Output: 19
//Explanation: In the given example:
//- Integers in the range [1, 10] that are not divisible by 3 are [1,2,4,5,7,8,10], num1 is the sum of those integers = 37.
//- Integers in the range [1, 10] that are divisible by 3 are [3,6,9], num2 is the sum of those integers = 18.
//We return 37 - 18 = 19 as the answer.
public class LeetCode2894 {
    public static int diffrenceOfSum(int n, int m){
       int x = n / m;
       int num2 = m * x * (x + 1)/2;
       int num1 = n * (n + 1)/2 - num2;
       return num1 - num2;
    }

    public static void main(String[] args) {
        System.out.println(diffrenceOfSum(10, 3));
    }
}
