public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,5,5,6};
        int count = 0;
        int x = 5;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println(count);
    }
}
