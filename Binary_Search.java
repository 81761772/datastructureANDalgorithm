package study;

public class Binary_Search{

    public int Binary_Search(int[] arr,int target){    	
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int mid = (first+last)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                last = mid-1;//这个-1和下面的+1是最骚的
            }else{
                first = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
		int[] arr = {2,4,6,8,9,13,15,18,56,89,92,96,99,105,109};//length = 10;
		Binary_Search bs = new Binary_Search();
		System.out.println(bs.Binary_Search(arr,105));
    }
}