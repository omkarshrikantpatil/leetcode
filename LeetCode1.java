import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//
//
//
//            Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//
//    Input: nums = [3,3], target = 6
//    Output: [0,1]

    public static int[] twoSum(int nums[], int target){
        //Brute Force
//        for(int i=0; i<nums.length; i++){
//            for(int j=0; j<nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[] {i, j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No sum found");
        Map<Integer, Integer> mapToIndex = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(mapToIndex.containsKey(complement)){
                return new int[] {mapToIndex.get(complement), i};
            }

            mapToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No sum found");
    }
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5};
        int target = 5;
        int [] result = twoSum(num, target);
        System.out.println(Arrays.toString(result));
    }
}
