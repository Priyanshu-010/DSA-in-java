import java.util.Arrays;
import java.util.Scanner;

public class SamllestAndLargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of elements in the Array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Put the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        int[] ans = sAndLElemenets(arr);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i]);
//        }

        int[] ans = sort(arr);
        System.out.println("Smallest Element is " + ans[0]);
        System.out.println("Largest Element is " + ans[1]);
    }
    static int[] sAndLElemenets(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
            } else if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return new int[]{smallest, largest};
    }
    static int[] sort(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }
    // We can sort the array and return the element at 0th index as smallest and last
    // index as largest
}
