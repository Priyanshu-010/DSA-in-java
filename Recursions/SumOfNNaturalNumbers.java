import java.util.Scanner;

public class SumOfNNaturalNumbers {
    static int ans = 0;
    static void sum(int n){
        if(n == 1){
            ans += n;
            return;
        }
        ans += n;
        sum(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sum(n);
        System.out.println("Sum of "+ n  +" natural numbers is : " +ans);
    }

}
