
public class chan {

	public static void main(String[] args) {
		int n[][]= {
				{1},			// (0,0) x행 y열
				{1,2,3},		// (1,2)			  
				{1},			// (2,0)
				{1,2,3,4},		// (3,3)
				{1,2}			// (4,1)
					};
		for(int x=0;x<n.length;x++) 
		{
			for(int y=0;y<n[x].length;y++)
				System.out.print(n[x][y]);
				System.out.println(" ");
		}
	}
}
