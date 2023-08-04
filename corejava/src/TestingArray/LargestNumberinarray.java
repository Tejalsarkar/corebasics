package TestingArray;

public class LargestNumberinarray {


   public static void main(String[] args) {
        int[] number = {55, 100, 22, 822, 333};

/*        int max = numbers[0]; // Assume the first element is the maximum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update the maximum value
            }
        }

        System.out.println("The largest number in the array is: " + max);
    }
}*/

  int a=0;
  for(int i =0;i<number.length;i++) {
	  if (number[i]>a) {
		  a=number[i];
		  
	  }
  }
   System.out.println("LragestNumberis=" + a);
   }
   }