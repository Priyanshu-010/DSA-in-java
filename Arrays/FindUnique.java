public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,8,4,4,5,5};
        int ans = findUnique(arr);
        System.out.println(ans);
    }
    static int findUnique(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    arr[i]=-1;
                    arr[j]= -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }
}
