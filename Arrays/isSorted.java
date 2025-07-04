import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of elements in the Array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Put the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        boolean ans = isSortedAscending(arr);
        System.out.println(ans);
    }
    static boolean isSortedAscending(int[] arr){
        boolean check = true;
        for(int i = 1; i< arr.length; i++){
            if(arr[i]< arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
}
