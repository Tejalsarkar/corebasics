package TestingArray;

public class Testarray3 {

	public static void main(String[] args) {
   String [] names = { "Rajendra","ravindra"};
   int Count =0;
    for(String S:names) {
    	for (int i=0; i<S.length(); i++) {
    		if(S.charAt(i) == 'r'){
    			Count++;
    		}
    	}
    }


System.out.println(Count );

System.out.println("Rajendra");
	}
	

}
