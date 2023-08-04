package prePost;

public class PrePost1 {
	public static void main(String[] args) {
		int i,j,k;
		i=0;
		j=0;
		k=2;
		System.out.println(i++ + ++i + ++i + i++);
		System.out.println(++i + ++k + ++j + i++);
		System.out.println(i);
	}

}
