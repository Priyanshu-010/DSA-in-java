import java.util.*;

public class ChangeACharInString {
    public static void main(String[] args) {
        String s = "hello"; // change first l to y
        System.out.println(s.substring(0,2) + 'y' + s.substring(3));
    }
}
