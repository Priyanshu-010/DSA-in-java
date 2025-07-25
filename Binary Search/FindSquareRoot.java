public class FindSquareRoot {
    public static void main(String[] args) {
        int x = 16;

        System.out.println(squareRoot(x));
    }
    static int squareRoot(int x){
        int s = 0, end = x;
        int ans = -1;

        while (s<= end){
            int mid = s+(end-s)/2;
            long val = (long)mid * mid;
            if(val == x){
                return mid;
            } else if (val < x){
                ans = mid;
                s = mid + 1;
            } else {
                end = mid -  1;
            }
        }

        return ans;
    }
}
