import java.util.ArrayList;

public class PairSumLinear {
    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int si = 0;
        int ei = list.size() - 1;
        while (si != ei) {
            if (list.get(si) + list.get(ei) == target) {
                return true;
            }

            if (list.get(si) + list.get(ei) < target) {
                si++;
            } else {
                ei--;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(list);
        System.out.println(pairsum(list, target));
    }
}
