public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "abcdcba";
        int res = checkPalindromicSubstrings(str);
        System.out.println("number of substring are: " + res);
    }
    static int checkPalindromicSubstrings(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String s = str.substring(i, j);
                boolean ans = checkPalindrome(s);
                if(ans){
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
        }
        System.out.println();
        return count;
    }
    static boolean checkPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i< j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
