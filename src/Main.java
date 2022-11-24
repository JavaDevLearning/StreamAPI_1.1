
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static List<Integer> positiveCount(List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                tmp.add(list.get(i));
            }
        }
        list = tmp;
        return list;
    }

    public static List<Integer> evenNumber(List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                tmp.add(list.get(i));
            }
        }
        Collections.sort(tmp);
        list = tmp;
        return list;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positivList = positiveCount(intList);

        System.out.println(evenNumber(positivList).toString());
    }
}
