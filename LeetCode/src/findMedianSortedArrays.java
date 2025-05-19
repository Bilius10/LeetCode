import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};

        double mediana = mediandaDeArrays(nums1, nums2);
        System.out.println("Mediana: " + mediana);
    }

    public static double mediandaDeArrays(int[] nums1, int[] nums2) {

        List<Integer> objects = new ArrayList<>();

        Arrays.stream(nums1).boxed().forEach(objects::add);
        Arrays.stream(nums2).boxed().forEach(objects::add);

        Collections.sort(objects);

        double indice = (double) objects.size() / 2;

        if(indice % 1 != 0){
            return objects.get((int) indice);
        }else{
            System.out.println("i");
            return (double) (objects.get((int) indice) + objects.get((int) indice - 1)) /2;
        }

    }
}
