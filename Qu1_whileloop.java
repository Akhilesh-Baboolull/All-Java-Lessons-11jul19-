import java.util.Scanner;
public class Qu1_whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		
		double mark = 0;
		double total= 0;
		double average;
		int count = 0;
		double min = 99999;
		double max = 0;
				
		while (mark != -1) {
			
			System.out.print("Enter numbers(-1 to exit loop): ");
			mark = myInput.nextDouble(); //Input mark
			if (mark != -1) {
			total += mark; //sum up the marks
			count++; //increment count
			
			if (mark < min) {
				min = mark;
			}
			
			if (mark > max) {
				max = mark;
			}
				
			}
			else {
				
				System.out.print("You entered -1 to exit loop");				
			}
				
			}
		
		average = total / count;
		
		System.out.println("The average is " + average);
		System.out.println("Maximum Mark: " + max);
		System.out.println("Minimum Mark: " + min);
			
		
		myInput.close();
		}
		
		
		
		
		
	}


