public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,-1,0,1,2,3};
        System.out.println(findMin(arr));
    }

    // Optimized and Correct Verrsion of code

    static int findMin(int[] nums) {
        int s = 0, end = nums.length -1;
        while(s < end){
            int mid= s + (end - s)/2;
            if(nums[mid] > nums[end]){
                s = mid +1;
            } else if(nums[mid] <= nums[end]){
                end = mid;
            }
        }
        return nums[s];
    }

//    static int findMin(int[] arr){
//        int n = arr.length;
//        int s = 0, end = n-1;
//        int ans = Integer.MAX_VALUE;
//
//        while(s < end){
//            int mid = s + (end-s)/2;
//            if(arr[mid] > arr[end]){
//                s = mid +1;
//            } else{
//                ans = mid;
//                end = mid;
//            }
//        }
//
//        return arr[ans];
//    }
}
