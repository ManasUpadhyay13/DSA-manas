package Recursion;

public class AllPossibleSubSetInString {
    public static void main(String[] args) {
        PrintSub("", "abc");
    }

    static void PrintSub(String p, String up) {
        if (up.isEmpty()) {
            System.err.println(p);
            return;
        }

        char ch = up.charAt(0);
        PrintSub(p + ch, up.substring(1));
        PrintSub(p, up.substring(1));
    }
}
