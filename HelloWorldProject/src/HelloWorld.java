import java.util.Scanner;
import java.lang.Math;
/*
 * TODO: Name: Meade Havenstein
 * TODO: Date: 9/17/25
 * TODO: Class Period: 6
 * TODO: Program Description: Converts binary to decimal and decimal to binary depending on user input.
 */
public class HelloWorld {

	public static void main(String[] args) 
	{
		//TODO: Implement Program Requirements Here
		boolean go = true;
		Scanner scanner = new Scanner(System.in);
		while (go==true){
		
		System.out.println("If you would like to convert decimal to binary, enter 1, if you would like to convert binary to decimal enter 2.");
		int answer = scanner.nextInt();
		scanner.nextLine();
		while(answer > 2 || answer < 1)
		{
			System.out.println("You entered an invalid answer. If you would like to convert decimal to binary, enter 1, if you would like to convert binary to decimal enter 2.");
			answer = scanner.nextInt();
			
		}
		if(answer == 1)
			{
				System.out.println("Please enter your number:");
				int num = scanner.nextInt();
				scanner.nextLine();
				System.out.println(convertDecBin(num));
			}
			else
			{
				System.out.println("Please enter your number:");
				String num = scanner.nextLine();
				
				System.out.println(convertBinDec(num));
			}
		System.out.println("Would you like to convert something else? (enter 'true' or 'false')");
		go = scanner.nextBoolean();
		
		}
		scanner.close();
	}
	public static String convertDecBin(int num)
	{
		String number = "";
		while(num > 0)
		{
			number = num%2 + number;
			num/=2;
		}
		return number;
	}

	public static int convertBinDec(String num)
	{
		double temp = 0.0;
		for(int i = num.length() - 1; i >= 0; i--)
		{
			if(num.charAt(i) == '1')
			{
				temp += Math.pow(2, num.length() - 1 - i);
			}
		}
		int number = (int)temp;
		return number;
	}
}
