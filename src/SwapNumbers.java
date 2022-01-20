
public class SwapNumbers {

	static int num1 = 100;
	static int num2 = 200;
	static int num3 = 300;
	static int temp = 0;
	
	public static void swapTwoNumbersWithTemp() {
		
		temp = num1; 
		num1= num2;
		num2= temp;
		
	}
	public static void swapTwoNumbersWithoutTemp() {
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1= num2 - num1;
		
	}
	public static void swapThreeNumbersWithTemp() {
		temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = temp;
		
	}
	

	public static void main(String[] args) {
		System.out.println("Before Swapping");
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		System.out.println("num3 = "+ num3);
		
		System.out.println("After Swapping with Temp");
		
		swapTwoNumbersWithTemp();
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		
		System.out.println("Before Swapping 2 numbers without Temp");
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		
		System.out.println("After Swapping 2 numbers without Temp");
		
		swapTwoNumbersWithoutTemp();
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		
		System.out.println("Before Swapping 3 numbers with Temp");
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		System.out.println("num3 = "+ num3);
		System.out.println("After Swapping 3 numbers with Temp");
		swapThreeNumbersWithTemp();
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		System.out.println("num3 = "+ num3);
		

	}

}
