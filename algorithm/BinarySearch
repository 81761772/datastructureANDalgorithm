package study;

public class BinarySearch{

    public int BinarySearch(int[] arr,int target){    	
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int mid = (first+last)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                last = mid-1;//Õâ¸ö-1ºÍÏÂÃæµÄ+1ÊÇ×îÉ§µÄ。
            }else{
                first = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
		int[] arr = {2,4,6,8,9,13,15,18,56,89,92,96,99,105,109};//length = 10;
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.BinarySearch(arr,105));
    }
}
