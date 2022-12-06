package lab10;

public class task2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		printArrayElements(arr,4);
		System.out.println("-------");
		int arr2[]= {7,8,9,10,11,12};
		printArrayElements(arr2,5);
		
	}
	
	static void printArrayElements(int a[], int index) {
		if(index!=-1) {
			
			printArrayElements(a,index-1);
			System.out.println(a[index]);

		}
	}
}