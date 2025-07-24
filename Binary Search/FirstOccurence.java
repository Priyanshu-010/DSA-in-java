public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 5,5,5,6,7,7, 8,8,9,9};
        int target = 5;
        int ans = firstOccurence(arr, target);
        System.out.println(ans);
    }
    static int firstOccurence(int[] arr, int target){
        int s = 0;
        int end = arr.length-1;
        int fo = -1;

        while(s <= end){
            int mid = s +(end - s)/2;
            if(arr[mid] == target) {
                fo = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                s = mid+1;
            } else {
                end = mid-1;
            }
        }
        return fo;
    }
}
