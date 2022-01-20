
public class SwapNumbers {

	static int num1 = 100;
	static int num2 = 200;
	
	public static void swapTwoNumbersWithTemp() {
		int temp = 0;
		temp = num1; 
		num1= num2;
		num2= temp;
		
	}

	public static void main(String[] args) {
		System.out.println("Before Swapping");
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		System.out.println("After Swapping");
		swapTwoNumbersWithTemp();
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);

	}

}
