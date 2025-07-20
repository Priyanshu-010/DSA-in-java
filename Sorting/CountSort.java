public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,3,5,2,1};
        basicCountSort(arr);
        printArray(arr);
    }

    static void basicCountSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; //Increasing the value of the element present at the index of arr[i](value)
/*
For ex. if arr[i] has value 2 on it the value of count at the index of too will be
increased by one so at first every element of count will contain 0 and it will be
increased if found in th original array

Ex. arr = 2 2 4 4

           0 0 2 0 2
    count  0 1 2 3 4
 */
         }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }

    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
