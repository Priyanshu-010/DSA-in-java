public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
    }

    static void swappingArray(int i, int j){
        if(i> j){
            return;
        }

        swap();
    }

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
