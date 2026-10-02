import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(50);
		nums.add(4);
		nums.add(80);
		nums.add(100);

		int bignum = 0;

		for (int i = 0; i < nums.size(); i++) {
			if (!isTheCurrentBigger(nums.get(i), bignum)) {
				bignum = nums.get(i);
			}
		}
		System.out.println(bignum);// expect 8
	}

	public static boolean isTheCurrentBigger(int current, int last_big_number) {
		if (current < last_big_number) {
			return true;
		}
		return false;
	}
}
