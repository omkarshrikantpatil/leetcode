public class LeetCodeBinarySearch {
    public static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1, 2, 3, 4, 5, 6}, 5));
    }
}
