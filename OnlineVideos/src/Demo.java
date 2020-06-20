
public class Demo {

	public static void main(String[] args) {
	/*Print
	 * *********
	 * *       *
	 * *       *
	 * *       *
	 * *********
	 */
		for(int i=0;i<5;i++)
		{
			System.out.println();
			for(int j=0;j<9;j++)
			{
				if(i==0 ||i==4)
				{
					System.out.print("*");
				}
				else if(j==0 ||j==8)
				{
					System.out.print("*");
				}
				else 
					{
					System.out.print(" ");
					}
				
			}
		}

	}

}
