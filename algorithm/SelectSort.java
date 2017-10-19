package study;

public class SelectSort {
	
	public static void sort(int arr[]){
		int smallestIndex;
		for(int i = 0;i < arr.length-1;i++){
			smallestIndex = seekSmallestIndex(i,arr);
			interchange(i,smallestIndex,arr);
		}
		for(int m = 0;m<arr.length;m++){
			System.out.println(arr[m]);
		}
	}
	
	private static int seekSmallestIndex(int startIndex, int arr[]){
		int min = arr[startIndex];
		int indexOfMin = startIndex;
		for(int j = startIndex;j < arr.length;j++){
			if(arr[j] < min){
				indexOfMin = j;
			}
		}
		return indexOfMin;
	}
	
	private static void interchange(int i,int j,int arr[]){
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args){
		int[] arr = {66,20,33,55,53,57,69,11,67,70};
		new SelectSort();
		SelectSort.sort(arr);
	}
}
