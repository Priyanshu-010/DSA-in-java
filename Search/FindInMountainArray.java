public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 5, 6, 7, 12, 15, 14, 13, 11, 10, 9, 8};
        int target = 0;
        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target){
        int peak = findPeakElem(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length -1);
    }
    static int findPeakElem(int[] arr){
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
    static int orderAgnosticBS(int[] arr, int target, int s, int end) {
//        int s = 0;
//        int end = arr.length - 1;
        //find whether the array is sorted ascending or descending

        boolean isAsc = arr[s] < arr[end];


        while (s <= end) {
            int mid = s + (end - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    s = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
