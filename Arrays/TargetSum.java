public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {3,3,4,2,5,1};
        int x  = 6;
        int countPairs = 0;
        for(int i= 0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == x){
                    countPairs++;
                }
            }
        }
        System.out.println(countPairs);
    }
}
