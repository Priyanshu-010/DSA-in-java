import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine());
        System.out.print("Real String: ");
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // True means Capital
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int asci = (int)ch;
            if(asci >= 97) flag = false; // Ascii value of A is 65 and a is 97
            if(flag == true){ // capital
                asci += 32; // difference between ascii values of A and a is 32 of every letters capital and small will have the difference of 32
                char ans = (char)asci;
                str.setCharAt(i, ans);
            } else {
                asci -= 32;
                char ans = (char)asci;
                str.setCharAt(i, ans);
            }
        }
        System.out.print("Toggled String: ");
        System.out.println(str);
    }
}
