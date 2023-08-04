package TestingArray;

public class Abcxyz {

	public static void main(String[] args) {
		String[] name = { "abc", "xyz" };
		int Count = 0;

		for (char c = 'a'; c <= 'z'; c++) {
			for (String s : name) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == c) {
						Count++;
					}
				}
			}
			if (Count > 0) {
				System.out.println(c + "=" + Count);

			}Count=0;
		}
	}
}
