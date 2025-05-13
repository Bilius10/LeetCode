public class TwoSun {
    public static void main(String[] args) {

    }

    public static int[] twoSun(int[] nums, int target){

        int[] vetor = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                int soma = nums[i] + nums[j];

                if(soma == target){
                    vetor[0] = i;
                    vetor[1] = j;
                    return vetor;
                }
            }

        }

        return vetor;
    }
}