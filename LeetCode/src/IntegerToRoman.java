import java.util.Arrays;
import java.util.List;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }

    public static String intToRoman(int num) {

        if(num <= 1 || num >= 3999){
            return "";
        }

        String nome = "";

        List<Integer> valores = Arrays.asList(1000, 900, 400, 500, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        List<String> simbolos = Arrays.asList("M", "CM", "CD", "D", "C", "CD", "L", "XL", "X", "IX", "V", "IV", "I");

        for (int i = 0; i < valores.size();) {


            if(num - valores.get(i) >= 0){
                num -= valores.get(i);
                nome += simbolos.get(i);
            }else{
                i++;
            }
        }
        return nome;
    }


}
