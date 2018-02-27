//Author: Daniel Li
//Title: Lab 3.2

public class ArrayMethods2 {

	public static void main(String[] args) 
	{
		//Testing Arrays
		String[] list1 = {"apple", "cucumber", "microsoft", "zorro"};
		String[] list2 = {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int[] list3 = {3, 4, 2, 7, 12, 22, 0, 1};
		
		//Merge Test
		long start = System.nanoTime();
		merge(list1,list2);
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("Merge test took: " + time + "nanoseconds.");
		System.out.println(java.util.Arrays.toString(merge(list1,list2)));
		
		//Partition Test
		start = System.nanoTime();
		int pivotFinal = partition(list3);
		end = System.nanoTime();
		time = end-start;
		System.out.println("Partition test took: " + time + "nanoseconds.");
		System.out.println("Final pivot position: " + pivotFinal);
		System.out.println(java.util.Arrays.toString(list3));
	}
	
	
	public static String[] merge(String[] list1, String[] list2)
	{
		int list1Index = 0;
		int list2Index = 0;
		int sortedIndex = 0;
		String[] y = new String[list1.length+list2.length];
		
	    while(list1Index<list1.length&&list2Index<list2.length)
	    {
	        if(list1[list1Index].compareTo(list2[list2Index])<0)
	        {
	            y[sortedIndex] = list1[list1Index];
	            list1Index++;
	        }
	        else
	        {
	            y[sortedIndex] = list2[list2Index];
	            list2Index++;
	        }
	        sortedIndex++;
	    }
	    while(list1Index<list1.length)
	    {
	        y[sortedIndex] = list1[list1Index];
	        list1Index++;
	        sortedIndex++;
	    }
	    while(list2Index<list2.length)
	    {
	        y[sortedIndex] = list2[list2Index];
	        list2Index++;
	        sortedIndex++;
	    }

	    return y;
	}
	
	
	public static int partition(int[] list1)
	{
		int pivot = list1[0];    
	    int right = list1.length -1;
	    int index = 0;

	    for(int i = 1;i<list1.length;i++)
	    	{
		        if(list1[i]<pivot)
		        {
		            int temp = list1[i];
		            list1[i] = list1[i-1];
		            list1[i-1] = temp;             
		            index = i;
		        } 
		        else if(list1[i]>pivot&&right>i)
		        {
		            int temp = list1[i];
		            list1[i] = list1[right];
		            list1[right] = temp;
		            right -= 1;
		            i--;
		        }
	    	}
	    return index;
	}
}
	
