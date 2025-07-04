public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 234, 45,5,6,2345,1};
        int ans = findEvenNums(arr);
        System.out.println(ans);
    }

    static int findEvenNums(int[] arr){
        int count = 0;
        for(int num : arr){
            if(findEven(num)){
                count++;
            }
        }
        return count;
    }

    static boolean findEven(int num){
        int numOfDigits = digits(num);
        if(numOfDigits % 2 == 0){
            return  true;
        }
        return false;
    }

    static int digits(int num){
        int count = 0;

        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
