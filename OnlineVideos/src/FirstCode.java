/*
 * Date: 20/06/2020 
 * This java class is solely created by me to practice java from 
 * Full java course on Tellusko
 */
public class FirstCode

{
	public static void main(String[] args)	//MAIN METHOD
	{	
		/*
		 * PRINT
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		//LOOP STARTS
		for(int i=1;i<6;i++)	//TO SET THE NUMBER OF ROWS
		{	
			for(int j=1;j<i;j++)	//TO SET THE NUMBER OF ENTRIES IN A ROW WE HAVE ADJUSTED IT TO BE LESS THAN i SO 
									//THAT WE GET THE DESIRED PATTERN
				System.out.print(j+"");	//SET j TO GET THE NUMBERS(i.e THE VALUE OF J)  IN THE ROW 
			System.out.println();
		}
	}
}
//CODE ENDS