package src.main.java;
//import stuff here
import java.util.Scanner;
//Your code here

public class Program7{
	//Define your final variables here
	// **HINT: Maybe the conversion rates?????**
	private final int KlevinPerSchrute = 20;
	private final int  StanleyPerKlevin = 12;
	private final int StanleyPerSchrute = KlevinPerSchrute * StanleyPerKlevin;


	public static void main(String[] args){
		//Make you own test code here
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Schrute Bucks: ");
		int schrute = scanner.nextInt();

		System.out.println("Enter Klevins: ");
		int klevin = scanner.nextInt();

		System.out.println("Enter Stanley Nickels: ");
		int stanley = scanner.nextInt();

		double output = this.convertMoney(schrute, klevin, stanley);
		System.out.printf("Decimal schrute-bucks: $%.2f%n", output);
	}
	
	
	
	public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
		//implement a function that converts from the old format to the new format
		double totalStanley = stanleyNickels + klevins * StanleyPerKlevin + schruteBucks * StanleyPerSchrute;
		double schruteWithDecimal = totalStanley/ StanleyPerSchrute;
		return schruteWithDecimal;
		
	}
	
	
}

/*Output:
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickles: 
9
Decimal schrute-bucks: $7.89

*/
