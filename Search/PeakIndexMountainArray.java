public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 5, 6, 7, 12, 15, 14, 13, 11, 10, 9, 8};
//        int target = 90;
        int ans = simpleBS(arr);
        System.out.println(ans);
    }
    static int simpleBS(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else if(arr[mid] < arr[mid+1]){
                start = mid +1;
            }
        }
        return start;
    }
}
