import java.util.ArrayList;
public class MainList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            list.add(i * 1);
            list1.add(i * 2);
            list2.add(i * 3);
        }
        mainList.add(list);
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(mainList);

        // nested loops
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
