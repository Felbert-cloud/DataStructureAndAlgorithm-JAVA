import java.util.List;

public class main {

    public static void main(String[] args) {
        List<String> fruits = List.of("D", "U", "U", "U");
        int res = 0;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("D")) {
                res = res - 1;
            } else {
                res = res + 1;
            }
        }
        System.out.println(res);

    }
}
