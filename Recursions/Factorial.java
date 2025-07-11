public class Factorial {

    static int fac(int n ){
        if(n == 0){
            return 1;
        }

        int smallAns = fac(n-1);
        int ans = n * smallAns;
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fac(n));
    }
}
