public class smallestNumber {
    public static void main(String[] args) {
        int[] arr = {12,43,21,2,6,72,-3,56};
        int result = smallestNum(arr);
        System.out.println(result);
    }
    static int smallestNum(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
