public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90, 85, 80, 75, 2};
        int target = 2;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int end = arr.length - 1;
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
