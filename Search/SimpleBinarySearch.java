public class SimpleBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 5, 12,15, 26, 82,85, 88, 90, 92};
        int target = 90;
        int ans = simpleBS(arr, target);
        System.out.println(ans);
    }

    static int simpleBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
