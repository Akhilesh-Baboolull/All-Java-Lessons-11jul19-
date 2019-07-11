import java.util.Scanner;


/*
 * 




 *
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Enter Year: ");
		int year = myInput.nextInt();
		
		
		if ((year % 400) == 0) {
			
			System.out.println(year + " is a leap year.");
			
		}
			
		else {
				if ((year % 100) == 0) {
					
					System.out.println(year + " is a NOT leap year.");
				}
					else {
						if ((year % 4) == 0) {
						
							System.out.println(year + " is a leap year.");
						}
							else {
								System.out.println(year + " is a NOT leap year.");
							}
						}
					}
		
		
		
		myInput.close();
		
		
				}
				
			
		
			
	
	}
	


