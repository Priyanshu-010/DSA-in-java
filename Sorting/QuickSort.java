public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,7,1,8,2,5,9};
        System.out.println("Array before sorting: ");
        printArray(arr);
        System.out.println();
        quickSort(arr, 0, arr.length-1);

        System.out.println("Array after sorting: ");
        printArray(arr);
    }

    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi =  partition(arr, st, end);
        quickSort(arr, st, pi -1);
        quickSort(arr, pi+1, end);
    }

    static int partition(int[]  arr, int st, int end){
        int pivot = arr[st];
        int count = 0;

        for (int i = st +1; i <= end; i++) {
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);

        int i = st, j = end;
        while (i< pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
