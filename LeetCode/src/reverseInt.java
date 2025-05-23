public class reverseInt {

    public static void main(String[] args) {
        System.out.println(reverse(-846384741));
    }

    public static int reverse(int x) {

        if(x > 214483647 || x < -2147483648){
            return 0;
        }

        StringBuilder reverse = new StringBuilder(String.valueOf(x));

        if(x < 0 ){
            reverse.deleteCharAt(0);
            reverse.append('-');
        }

        return Integer.valueOf(String.valueOf(reverse.reverse()));

    }
}
