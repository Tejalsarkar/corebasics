package OneDimensinalArray;

public class OneDarray {
 public static void main(String[] args) {
	int[] table1 = {2,4,6,8,10,12,14,16,18,20};
	int[] table2 = new int [10];
	for (int i =1;i<table2.length; i++) {
		table2[i] = 2*i;
		System.out.println(table2[i]+ "" );
	}

}
}