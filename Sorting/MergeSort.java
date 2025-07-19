public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,6,1};
        int n = arr.length;
        System.out.println("Array before sorting: ");
        printArray(arr);
        mergeSort(arr, 0 , n-1);
        System.out.println("Sorted Array");
        printArray(arr);
    }
    static void mergeSort(int[] arr, int l, int r){
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        int i,j,k;

        for(i = 0; i< n1; i++) left[i] = arr[l+i];
        for(j = 0; j< n2; j++) right[j] = arr[mid+j+1];

        i = 0;
        j = 0;
        k = l;

        while(i< n1 && j< n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++]; // First they will assign the value and the increment
            } else{
                arr[k++] = right[j++]; // First they will assign the value and the increment
            }
        }

        while(i < n1){
            arr[k++] = left[i++];
        }
        while(j< n2){
            arr[k++] = right[j++];
        }
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
