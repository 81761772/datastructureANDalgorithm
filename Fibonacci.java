package com.study;

public class Fibonacci {
	//通过迭代获取斐波那契数列的第n个数。
	public int IterateFibonacci(int n){
		if(n<=0){
			System.out.println("n必须大于0");
		}
		if((n<=2)&&(n>0)){
			return 1;
		}else{
			int pre_pre = 1;
			int pre = 1;
			int sum = 0;
			for(int i=0;i<n-2;i++){
				sum = pre_pre+pre;
				pre_pre = pre;
				pre = sum;
			}
			return sum;
		}
	}
	//通过递归获取斐波那契数列的第n个数。
	public int RecursiveFibonacci(int n){
		if(n<=0){
			System.out.println("n必须大于0");
		}
		if((n<=2)&&(n>0)){
			return 1;
		}else{
			return RecursiveFibonacci(n-1)+RecursiveFibonacci(n-2);
		}
	}
	//通过迭代获取指定位数的斐波那契数列。
	public void ShowFibonacci(int length){
		if(length<=0){
			System.out.println("error");
		}
		switch(length){
		    case 1:
			    System.out.println(1);
		    case 2:
			    System.out.println(1);break;
		    default:{
			    int pre_pre = 1;
			    int pre = 1;
			    int sum;
			    System.out.print(pre_pre+" ");
			    System.out.print(pre+" ");
			    for(int i=3;i<=length;++i){
			    	sum = pre_pre+pre;
			    	System.out.print(sum+" ");
			    	pre_pre = pre;
			    	pre = sum;
			    }
		    }
		}
	}
	
	public static void main(String[] args){
		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.IterateFibonacci(5));
		System.out.println(fibonacci.RecursiveFibonacci(5));
		fibonacci.ShowFibonacci(5);
	}
}
