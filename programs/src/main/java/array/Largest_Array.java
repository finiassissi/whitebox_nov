package array;

public class Largest_Array {
		int largest(int[] arr) {
			int temp=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(temp<arr[i]) {
					temp=arr[i];
				}
					
				
			}
			
			return temp;
		}
		 public static void main(String[] args) {
			Largest_Array lar=new Largest_Array();
			 int[] array= {1,2,5,3,6,3,5,8};
			System.out.println(lar.largest(array));
		}
}
