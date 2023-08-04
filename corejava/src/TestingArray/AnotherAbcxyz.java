package TestingArray;

public class AnotherAbcxyz {

	public static void main(String[] args) {
String []m = { "abc" ,"xyz"};
 int Count =0;
for(char c='a'; c<='z';c++) {
	for(String s : m)
{
	for(int i =0; i <s.length(); i ++ ) 
	{
	if (s.charAt(i)==c)
	{
		Count ++;
	}
	}
}
if (Count>0) {
 	System.out.println( c + "=" + Count);

}Count = 0;
	}
	}
}
