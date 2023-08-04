package exerciseCoreJava;

public class ChangeNameArray {

	public static void main(String[] args) {
		String[] n = { "India is my Country" };
		for (int i = 0; i < n.length; i++) {
			for (int j = n[i].length() - 1; j >= 0; j--)

			{
				System.out.print(n[i].charAt(j));
				System.out.print("String Length :"+n.length);
				System.out.println("7th charchter:"+n);
			}
		}

	}

}

