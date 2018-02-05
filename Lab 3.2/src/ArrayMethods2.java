
public class ArrayMethods2 {

	public static void main(String[] args) 
	{
		String[] list1 = {"apple", "dandelion", "yoyo", "zebra"};
		String[] list2 = {"bubble", "pop", "quilt"};
		merge(list1, list2);
		
	}
	
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] x = {};
		String[] y = {};
		String[] z = {};
		
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
		
		for(int i = 0;i<x.length;i++)
		{
			if(list1[i].compareTo(list2[i])<0)
			{
				y[i] = list1[i];
				y[i+1] = list2[i];
			}
			
			else
			{
				y[i] = list2[i];
				y[i+1] = list1[i];
			}
		}
		
		for(int i = x.length;i<z.length;i++)
		{
			y[i] = z[i];
		}
		
		return y;
	}
	
	
	public static int partition(int[] list)
	{
		
	}

}
