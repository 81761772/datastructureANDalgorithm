package study;

public class Recursion_Factorial {
	
	public static int factorial(int n){
		if(n==0){//数学中规定0的阶乘为1
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args){
		System.out.println(factorial(3));
	}
}
