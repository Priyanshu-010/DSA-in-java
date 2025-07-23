public class RecursiveBS {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,11,15,24};
        int s = 0;
        int end = arr.length-1;
        int target = 24;
        boolean ans = binarySearch(arr,s, end, target);
        System.out.println(ans);
    }
    static boolean binarySearch(int[] arr, int s, int end, int target){
        if(s >  end) return false;
        int mid = s +(end - s)/2; // better way to calculate mid
        // as sometimes mid can go above the value of maximum an integer can save which is 2 raise to 31
        if(target == arr[mid]){
            return true;
        } else if(arr[mid] > target){
            return binarySearch(arr, s, mid -1, target);
        } else{
            return  binarySearch(arr, mid +1, end, target);
        }

//        return false;
    }
}
