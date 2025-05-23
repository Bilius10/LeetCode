public class searchInsert {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 6};

        System.out.println(posicao(numeros, 7));
    }

    public static int posicao(int[] nums, int target){
        int posicao = 0;

        for (int i = 0; i <= nums.length-1; i++) {

            if(nums[i] < target){
                posicao = i+1;
            }
        }

        return posicao;
    }
}
