public class FindIndexOfTargetRotated {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,1,2,4,5};
        int target = 10;
        int ans = findTarget(arr, target);
        System.out.println(ans);
    }
    
    static int findTarget(int[] arr, int target){
        int s = 0, end = arr.length -1;
        while(s <= end){
            int mid = s +(end-s)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]< arr[end]) {
                if(target > arr[mid] && target <= arr[end]){
                    s = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if(target >= arr[s] && target < arr[mid]){
                    end = mid -1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
