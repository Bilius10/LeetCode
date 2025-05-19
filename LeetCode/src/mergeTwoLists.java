import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeTwoLists {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);

        // Criando a segunda lista
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(3);
        list2.add(6);

        List<Integer> list3 = juntarLista(list1, list2);

        for (Integer i : list3) {
            System.out.println(i);
        }

    }

    public static List<Integer> juntarLista(List<Integer> list1, List<Integer> list2) {

        for (Integer i : list2) {
            list1.add(i);
        }

        Collections.sort(list1);

        return list1;
    }
}
