public class LeetCodeRotatedArray {
    //Given a sorted and rotated array A of N distinct elements which is rotated at some point
    //and given an element key. The task is to index of the given element key in the Array A
    public static int findKey(int [] arr, int len, int key){
        int point = findPoint(arr, 0, len-1);

        //Case 1: Array not rotated
        if(point == -1){
            binarySearch(arr, 0, len - 1, key);
        }

        //Case 2: Key is at pivot
        if(arr[key] == point) return point;

        //Case 3: Key is in the left part
        if(key > arr[point]) return binarySearch(arr, 0, point - 1, key);

        //Case 4: Key is in the right part
        return binarySearch(arr, point + 1, len - 1, key);

    }
    public static int findPoint(int [] arr, int low, int high){
        //Search range is invalid
       if(high < low) return -1;


       if(high == low) return low;
       int mid = (low + high)/2;
       if(mid < high && arr[mid] > arr[mid+1]) return mid;
       if(mid > low && arr[mid] < arr[mid-1]) return mid - 1;
       if(arr[low] >= arr[mid]) return findPoint(arr, low, mid - 1);
       return findPoint(arr, mid + 1, high);
    }
    public static int binarySearch(int [] arr, int start, int end, int key){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key) return mid;
            if(key < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 1, 2, 3};
        int key = 6;
        int index = findKey(arr, arr.length, key);
        System.out.println("Index of " + key + " is " + index);
    }
}
