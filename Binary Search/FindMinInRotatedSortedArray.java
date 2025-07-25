public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int n = arr.length;
        int s = 0, end = n-1;
        int ans = Integer.MAX_VALUE;

        while(s < end){
            int mid = s + (end-s)/2;
            if(arr[mid] > arr[end]){
                s = mid +1;
            } else{
                ans = mid;
                end = mid;
            }
        }

        return arr[ans];
    }
}
