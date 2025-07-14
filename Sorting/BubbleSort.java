public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        sort(arr);
        printArray(arr);

    }
    static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
