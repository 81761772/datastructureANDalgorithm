package study;

public class IterationFactorial {
	
	public int factorial(int n){
		int value = 1;
		while(n>=1){
			value *= n;
			n--;
		}
		return value;
	}
	
	public static void main(String[] args){
		IterationFactorial IF = new IterationFactorial();
		System.out.println(IF.factorial(3));
	}
}
