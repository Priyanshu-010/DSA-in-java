import java.util.Scanner;

public class PrintFromNto1 {
    static void printDecreasing(int n){
        if(n ==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printDecreasing(n);
    }
}
