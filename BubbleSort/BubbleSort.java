import java.util.ArrayList;

public class BubbleSort {
    private static ArrayList<Integer> Numbers;

    public static void main(String[] args) {

        Numbers = new ArrayList<>();
        Numbers.add(3);
        Numbers.add(2);
        Numbers.add(4);
        Numbers.add(9);
        Numbers.add(1);
        Numbers.add(7);
        System.out.println("this the unsorted list" + Numbers);

        for (int ii = 0; ii < Numbers.size(); ii++) {
            for (int i = 0; i < Numbers.size(); i++) {
                if (i != Numbers.size() - 1) {
                    if (Numbers.get(i) > Numbers.get(i + 1)) {
                        int current_index_value = Numbers.get(i);
                        Numbers.set(i, Numbers.get(i + 1));
                        Numbers.set(i + 1, current_index_value);
                    }
                }
            }
        }
        System.out.println("this is the sorted list:" + Numbers);
    }

}
