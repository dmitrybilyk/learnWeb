import java.util.Arrays;
import java.util.List;

/**
 * Created by dmitry on 31.10.17.
 */
public class Main {
    public static void main(String[] args) {
//        String name = "Lerna";
//        System.out.println(name.equals("Lena") ? "yes" : "no");

        List<String> stringList = Arrays.<String>asList("Dima", "Lena");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
