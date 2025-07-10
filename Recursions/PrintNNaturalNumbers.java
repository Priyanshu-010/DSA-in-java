import java.util.Scanner;

public class PrintNNaturalNumbers {
    static void printIncreasing(int n){
        if(n ==1){
            System.out.println(n);
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printIncreasing(n);
    }
}
