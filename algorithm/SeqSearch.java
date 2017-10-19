package study;

public class SeqSearch {
	
	public int SeqSearch(int first,int last,int target,int[] arr){
		for(int i = first;i<last;i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;//×¢Òâ´Ë´¦ÓÃ·¨
	}
	public static void main(String[] args){
		int[] arr = {25,36,36,47,15};
		SeqSearch ss = new SeqSearch();
		System.out.println(ss.SeqSearch(0,arr.length,47,arr));
	}
}
