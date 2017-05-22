package study;

public class Iteration_Factorial {
	
	public int factorial(int n){
		int value = 1;
		while(n>=1){
			value *= n;
			n--;
		}
		return value;
	}
	
	public static void main(String[] args){
		Iteration_Factorial IF = new Iteration_Factorial();
		System.out.println(IF.factorial(3));
	}
}
