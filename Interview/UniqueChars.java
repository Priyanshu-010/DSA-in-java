import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.next();

        System.out.println("Does "+str + " has unique chars: "+hasUniqueChars(str));
    }
    static boolean hasUniqueChars(String str){
        if(str == null || str.length() <=1){
            return true;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
