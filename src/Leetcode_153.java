public class Leetcode_153 {
    public static void main(String[] args){
           System.out.println(findMin(new int[]{4,5,6,7,0,1,2})); 
    }

    public static  int findMin(int[] nums) {
          int start = 0;
          int end = nums.length-1;

          while(start <= end) {

              if (nums[start] <= nums[end]) {//means array is not rotated, just return the first element
                  return nums[start];
              }

              int mid = start + (end - start) / 2;

              if (nums[mid] > nums[end]) {
                    start = mid + 1;
              }else {
                    end = mid;
              }
          }
          return nums[start];//as in each search space start will be pointing to the minimum element
    }
    
}


