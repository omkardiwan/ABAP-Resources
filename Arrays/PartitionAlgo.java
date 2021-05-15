
import java.io.*;

class GFG {
    
    public static void swap(int[] arr, int i, int start)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
    }
	public static void main (String[] args) {
		int[] array =  {11,9,6,8,4};
		int start = -1;
		int pivot = 4;
		for(int i=0; i<array.length; i++)
		{
		    if(array[i] < pivot)
		    {
		        start++;
		        swap(array, i, start);
		    }
		}
		start++;
		 swap(array, array.length-1, start);
		
		for(int j=0; j<array.length; j++)
		{
		    System.out.println(array[j]);
		}
		
	}
}
