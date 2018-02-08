
public class ArrayMethods2 {

	public static void main(String[] args) 
	{
		String[] list1 = {"apple", "dandelion", "yoyo", "zebra"};
		String[] list2 = {"bubble", "pop", "quilt"};
		merge(list1,list2);
		System.out.println(java.util.Arrays.toString(merge(list1,list2)));
	}
	
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] x;
		String[] z;
		
		if(list1.length<list2.length)
		{
			x = list1;
			z = list2;
		}
		else
		{
			x = list2;
			z = list1;
		}
		
		String[] y = new String[z.length+x.length];
		int r = 0;
		for(int i = 0;i<x.length;i++)
		{
			if(list1[i].compareTo(list2[i])<0)
			{
				y[r] = list1[i];
				y[r+1] = list2[i];
				r+=2;
			}
			
			else
			{
				y[r] = list2[i];
				y[r+1] = list1[i];
				r+=2;
			}
		}
		
		for(int i = 0;i<z.length;i++)
		{
			y[r] = z[i];
		}
		
		return y;
	}
	
	
	public static int partition(int[] list)
	{
		int pivot = 0;
		int left = 0;
	}

}
