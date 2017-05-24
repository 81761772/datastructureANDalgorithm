package study;

public class RecursionSum {
	
	public int sum(int n){
		if(n==1){
			return 1;
		}else{
			return n+sum(n-1);
		}
	}
	
	public static void main(String[] args){
		RecursionSum rs = new RecursionSum();
		System.out.println(rs.sum(3));
	}
}
