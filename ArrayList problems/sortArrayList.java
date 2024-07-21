import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(3);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
