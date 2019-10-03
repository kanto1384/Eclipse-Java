
public class chan3 
{

	public static void main(String[] args) 
	{
		   int arr[][] = new int[4][4];
		      
		      for(int x=0; x<arr.length; x++) 
		      {
		         for(int y=0; y<arr[x].length;y++) 
		         {
		            arr[x][y] = (int)(Math.random()*10+1);	//문제는 1~10 컴퓨터는 0~9를 방지하기위함			
		         }					  
		      }
		      for(int x=0; x<arr.length; x++) 	
		      	{		
		         for(int y=0; y<arr[x].length; y++)
		         	{
		            System.out.print(arr[x][y] + " ");
		         	}
		         System.out.println();
		      	}      
	}		
}			
