import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 5, 3, 2, 9, 8, 18, 58, 91, 100);
        int find_num = 9;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == find_num) {
                System.out.println("found it on index: " + i);
                return;
            }
        }
    }
}
