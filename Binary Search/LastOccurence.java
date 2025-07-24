public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,6,7,7,7,7,8,8,9,9};
        int target = 7;
        int ans = lastOccurence(arr, target);
        System.out.println(ans);
    }
    static int lastOccurence(int[] arr, int target){
        int s = 0;
        int end = arr.length-1;
        int lo = -1;

        while(s <= end){
            int mid = s +(end - s)/2;
            if(arr[mid] == target) {
                lo = mid;
                s = mid + 1;
            } else if (target > arr[mid]) {
                s = mid+1;
            } else {
                end = mid-1;
            }
        }
        return lo;
    }
}
