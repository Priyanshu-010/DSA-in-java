import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1,2,5,5,5,8,9};
        int target = 5;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] num, int target) {
        int[] ans = {-1, -1};
        int start = search(num, target, true);
        int end = search(num, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] nums, int target, boolean findFirstOccur){
        int ans = -1;
        int s = 0;
        int end = nums.length -1;

        while(s <= end){
            int mid = s + (end-s)/2;
            if(nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                s = mid+1;
            }else{
                ans = mid;
                if(findFirstOccur){
                    end = mid-1;
                }else{
                    s = mid+1;
                }
            }
        }
        return ans;
    }
}
