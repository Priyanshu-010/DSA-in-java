public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {12,53,634, -654, 12, 3,54, 63, 26,83};
        int target = 26;
        int ans = findTarget(arr, target);
        System.out.println(ans);
    }
    static int findTarget(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
