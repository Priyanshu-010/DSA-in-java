public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
//        int[] ans = new int[n];

        for(int i = n-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
