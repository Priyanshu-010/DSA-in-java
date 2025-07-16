public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,0,0,5,0,0};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }



//        Optimized Solution

//        int i = 0;
//
//        for (int j = 0; j < n; j++) {
//            if (nums[j] != 0) {
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//        while (i < n) {
//            nums[i] = 0;
//            i++;
//        }
//

//      Loop for printing the sorted array

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
