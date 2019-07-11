import java.util.Scanner;

public class tempconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float farenheit;
		float celsius;
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Enter Temperature in farenheit: ");
		farenheit = myInput.nextInt();
		
		
		celsius = ((farenheit - 32) * 5) / 9;
		
						
		System.out.println("Temperature Conversion:");
		
		System.out.println("Farenheit 		Celsius");
		System.out.println(farenheit + "			" + celsius);
		
		
		myInput.close();
		
		
	}

}
