import java.util.Arrays;

public class plusOne {
    //continuar
    public static void main(String[] args) {

        int[] numeros = {9};
        int[] num = addUm(numeros);

        for (int i : num) {
            System.out.println(i);
        }
    }

    public static int[] addUm(int [] digits){

        digits[digits.length-1] += 1;

        if(digits[digits.length-1] > 9){
            String dvidi = String.valueOf(digits[digits.length-1]);
            System.out.println(dvidi);
            int[] ints = new int[dvidi.length()];

            int x = 0;
            for (char letra : dvidi.toCharArray()){

                ints[x] = letra;

                x ++;
            }

            return ints;
        }

        return digits;

    }
}
