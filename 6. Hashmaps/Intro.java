import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {

        HashMap<Integer, String> empId = new HashMap<>();

        empId.put(1, "manas");
        empId.put(2, "upadhyay");

        System.out.println(empId);
        // since there is already a key 1, the value will get updated
        empId.put(1, "Manas Upadated");
        System.out.println(empId);
    }
}
