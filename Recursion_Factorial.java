package study;

public class Recursion_Factorial {
	
	public static int factorial(int n){
		int value = 1;
		while(n>=1){
			value *= n;
			n--;
		}
		return value;
	}
	
	public static void main(String[] args){
		System.out.println(factorial(3));
	}
}
