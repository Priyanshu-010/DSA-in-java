public class SimpleBS {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,11,15,24};
        int target = 24;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int s = 0;
        int end = arr.length-1;


        while(s <= end){
            int mid = (s + end)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                s = mid+ 1;
            }
        }
        return -1;
    }
}
