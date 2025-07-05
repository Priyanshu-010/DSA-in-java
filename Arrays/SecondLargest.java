public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {0,-2,0,-3,0,-4};
        int ans = largest(arr);
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i] < ans){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
    static int largest(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
