package sorter.selection;


public class SelectionSortMain
{
	public static int[] numbers = new int[] {9, 78, 6, 4, -10, 7, 4, 3, 9, -9696, 5}; 
	

	public static void main(String[] args)
	{
		sortSort(numbers); 
		

	}
	
	
	
	public static void sortSort(int[] arr )
	{
		int bound = 0;
		int tempLow = arr[0]; 
		
		
		while(bound<arr.length)
		{
			if(bound<arr.length) 
			{
				tempLow=arr[bound];
			}
			 
			
			for(int i = bound; i<arr.length;i++)
			{
				if(arr[i]<tempLow)
				{
					tempLow= arr[i]; 
					arr[i] = arr[bound]; 
					arr[bound] = tempLow;
				}
			}
			
			for(int j = 0 ; j<arr.length; j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			bound++; 
			
			
		}
	}
}
