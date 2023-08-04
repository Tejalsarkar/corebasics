package StringBufferClasses;

public class Buffersub {

	public static void main(String[] args) {
		String s1= "Pankaj";
        String s2 = "Rahul";
      StringBuffer sb = new StringBuffer ("Pankaj"); //for change 
         
        sb.append(" Rahul");// for append 
      System.out.println(sb);
      System.out.println("Length:" + sb.length() );
      System.out.println("Capacity:" + sb.capacity());
      System.out.println("Char at:"+ sb.charAt(3));
      System.out.println("Index Of :" + sb.indexOf("Rahul"));
      System.out.println("Replace:" + sb.replace(1, 3,"rahul"));
      System.out.println("Reverse:" + sb.reverse());
	}

} 
