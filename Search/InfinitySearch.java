public class InfinitySearch {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 5, 12,15, 26, 82,85, 88, 90, 92, 99, 101,111,112};
        int target = 90;

        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newstart = end+1;
            end = end + (end - start + 1) *2;
            start = newstart;
        }
        return simpleBS(arr, target, start,end);
    }
    static int simpleBS(int[] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length - 1;

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
