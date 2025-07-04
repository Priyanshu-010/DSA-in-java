public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {5,3,5,2,5,2,2,5};
        int lastIndex = -1;
        int x = 5;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);
    }
}
