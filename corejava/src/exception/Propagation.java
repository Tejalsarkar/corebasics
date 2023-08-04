 package exception;

public class Propagation {
	public static void main(String[] args) throws TestPropGalti
	{
		Father();
	}
	public static void Father() throws TestPropGalti  {
		Mother();
	}
	public static void Mother() throws TestPropGalti  {
		son();
	}
public static void son() throws TestPropGalti 
{
	throw new TestPropGalti();
}
}

