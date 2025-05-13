import java.util.Arrays;

public class isPalindrome {

    public static void main(String[] args) {
        boolean batata = teste(-121);

        System.out.println(batata);
    }

    public static boolean teste(int x) {

        char[] y = String.valueOf(x).toCharArray();
        String nova = "";

        for (int i = y.length-1; i >= 0; i--) {
            nova += y[i];
        }

        return nova.equals(String.valueOf(y));
    }
}
