import java.util.Arrays;

public class triangleType {

    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 9;
        ints[1] = 4;
        ints[2] = 9;

        System.out.println(tipoDoTriangulo(ints));

    }

    public static String tipoDoTriangulo(int[] nums) {

        int[] sorted = Arrays.stream(nums).sorted().toArray();

        if (sorted[0] + sorted[1] > sorted[2]) {
            if (sorted[0] == sorted[1] && sorted[1] == sorted[2]) {
                return "equilateral";
            }else if (sorted[0] == sorted[1] || sorted[1] == sorted[2]) {
                return "isosceles";
            }else{
                return "scalene";
            }
        }

        return "none";
    }
}
