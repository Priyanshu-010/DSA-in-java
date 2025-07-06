public class RotatedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 103;

        int n = nums.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i< n; i++){
            ans[j++] = nums[i];
        }

        for(int i = 0; i< n-k; i++){
            ans[j++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }

        printArray(nums);
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
