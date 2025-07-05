public class FirstRepeatingValue {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10,3,10,5,6};
        int ans  = findRepeating(arr);
        System.out.println(ans);
    }
    static int findRepeating(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
