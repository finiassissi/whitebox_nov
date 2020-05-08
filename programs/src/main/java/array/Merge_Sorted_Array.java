package array;
/*
 * Write a program to merge 2 arrays.(sorted)
 */
public class Merge_Sorted_Array {
	void merge(int[] a,int[] b) {
		int i=0,j=0,k=0;
		int size= a.length+b.length;
		//System.out.println(size);
		int[] c=new int[size];
		
		while (i < a.length && j < b.length) {
			if (a[i] < b[j] ) {
				c[k++]=a[i++];
			} else if(a[i] > b[j]) {
				c[k++]=b[j++];
			} else {
				c[k++] = a[i++];
				j++;
			}
		}
		
		while (i < a.length) {
			c[k++] = a[i++];
		}
		
		while (j < b.length) {
			c[k++] = b[j++];
		}

		
		
		
		
		/*
		while(k<=size) {
			 
			if(i<a.length && j<b.length) {
				if (a[i] < b[j] ) {
					c[k]=a[i];
					i++;
				} else if(a[i] > b[j]) {
					c[k]=b[j];
					j++;
				} else {
					c[k] = a [i];
					i++; j++;
				}
				k++;
			}
			else
			{
				if(i<a.length) {
					c[k]=a[i++];
				}
				else if(j< b.length) {
					c[k]=b[j++];
				}
				k++;
			}
		}
		*/
		
		for(int s:c) {
			System.out.println(s);
		}	
	}
	public static void main(String[] args) {
		Merge_Sorted_Array m=new Merge_Sorted_Array();
		int[] x= {1,4,6,8,9};
		int[] y= {2,4,7};
		m.merge(x, y);
	}
}
