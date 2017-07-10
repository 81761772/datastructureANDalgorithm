package study;

public class RecursionSum {
	
	public int sum(int n){
		//第7，8行处理基准情况，如果没有处理基准情况的语句，那么就和f(x)=2f(x-1)+x^2没有“f(0)=0”一样，在数学上没有意义。
		if(n==1){
			return 1;
		//第10，11行为递归调用语句，将反复执行直到基准情况出现。
		}else{
			return n+sum(n-1);
		}
	}
	
	public static void main(String[] args){
		RecursionSum rs = new RecursionSum();
		System.out.println(rs.sum(3));
	}
}
