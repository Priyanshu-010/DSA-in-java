public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
//     This for loop print all the fibonacci numbers till n uncomment and check the answer
//        for (int i = 0; i <= n; i++) {
//            System.out.println(fib(i));
//        }
    }
    static  int fib(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        int ans = fib(n-1) + fib(n-2);
        return ans;
    }
}
