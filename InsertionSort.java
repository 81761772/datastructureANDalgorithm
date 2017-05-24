package study;

public class InsertionSort {
	
	/*此方法像是把传入的数组分为两部分，左边是已排序的，右边是未排序的，从“右数组”的最左边选取元素，
	      并从“左数组”最右边向左依次比较并插入，而实际上并无“左右数组”之分。*/
	public static void insertionsort(int[] arr){
		//外循环是从传入数组依次选取元素进行比较，假设数组第一个元素已经有序，故从i=1开始循环。
		for(int i=1;i<arr.length;i++){
			int j = i;
			/*注意此处不能用arr[i]代替temp，如果代替，假设进行第一次循环时，
			      第16行代码为"arr[1]=4;"，而第20行代码为"arr[0]=arr[1]"，
			      使得第一次循环结果为：arr[0]和arr[1]的值都为4，元素2丢失了。*/
			int temp = arr[i];
			//内循环是对当前元素进行插入操作，插入之前将该元素后的元素向后移位。
			while((j>0)&&(temp<arr[j-1])){
				//移位操作，等号左边是arr[j]的地址，等号右边是arr[j-1]的值。
				arr[j] = arr[j-1];
				j--;
			}
			//插入操作，等号左边是arr[j-1]的地址，等号右边是arr[i]的值。
			arr[j] = temp;
		}
		for(int m=0;m<arr.length;m++){
			System.out.print(arr[m]+" ");
		}
	}
	
	public static void main(String[] args){
		int[] arr = {4,2,6,3,1,5,7,9,8};
		InsertionSort.insertionsort(arr);
	}
}
