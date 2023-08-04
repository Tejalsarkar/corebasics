package TestingArray;

public class ArraynameChange {

	public static void main(String[] args) {
String[] name = {"Hajari lal jat"};
for( int i =0; i<name.length; i++) {
	for ( int j=name[i].length()-1;j>=0;j--) //yaha small bracket him use hoga
 
	{
	System.out.print(name[i].charAt(j));
		 }
}

	}

}
