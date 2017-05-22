package study;

public class Recursion_Sum {
	
	public int sum(int n){
		if(n==1){
			return 1;
		}else{
			return n+sum(n-1);
		}
	}
	
	public static void main(String[] args){
		Recursion_Sum rs = new Recursion_Sum();
		System.out.println(rs.sum(3));
	}
}
