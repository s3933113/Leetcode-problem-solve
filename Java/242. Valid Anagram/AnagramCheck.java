import java.util.Arrays;
import java.nio.charset.StandardCharsets;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "word";
        String s2 = "drow";

        byte[] b1 = s1.getBytes(StandardCharsets.UTF_8);
        byte[] b2 = s2.getBytes(StandardCharsets.UTF_8);

        Arrays.sort(b1);
        Arrays.sort(b2);

        //System.out.println(Arrays.equals(b1, b2)); // true
        System.out.println(Arrays.toString(b2));
    }
}