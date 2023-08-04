package TestNote;
//import java.util.Scanner;

public class NoteTest {

	public static void main(String[] args) {
	int amt = 3550;
	int n = amt;
	int r =0;
	if (n>2000) {
		n=n/2000;
		System.out.println("2000 = " + n);
		r=amt%2000;
		n=r;
		
	}
if (n>1000) {
	r=n%1000;
	n=n/1000;
	System.out.println("1000 =" + n);
	n=r;
}

if (n>500) {
	r=n%500;
	n=n/500;
	System.out.println("500 =  " + n);
	n=r;
}
if (n>100) {
	r=n%100;
	n=n/100;
	System.out.println(" 100 = " +n);
	n=r;
} 

if (n>50) {
	r=n%50;
	n=n/50;
	System.out.println("50 = " +n);
	n=r;
}
if (n>20) {
	r=n%20;
	n=n/20;
	System.out.println("20 =" +n);
	n=r;
}

if (n>10) {
	r=n%10;
	n=n/10;
	System.out.println("10 =" +n);
	n=r;
}
if (n>5) {
	r=n%5;
	n=n/5;
	System.out.println("5 = " +n);
	n=r;
}

	}

}
