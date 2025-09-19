import java.util.Scanner;
import java.lang.Math;
/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		Scanner scanner = new Scanner(System.in);
		System.out.println("If you would like to convert decimal to binary, enter 1, if you would like to convert binary to decimal enter 2.");
		int answer = scanner.nextInt();
		scanner.nextLine();
		while(answer > 2 || answer < 1)
		{
			System.out.println("You entered an invalid answer. If you would like to convert decimal to binary, enter 1, if you would like to convert binary to decimal enter 2.");
			answer = scanner.nextInt();
			if(answer == 1)
			{
				convertDecBin();
			}
			else
			{
				convertBinDec();
			}
			System.out.println("Would you like to enter a new number? (enter yes or no)")
			if()
		}
		scanner.close();
	}
public static void convertDecBin()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your number:");
		int num = scanner.nextInt();
		scanner.nextLine();
		String number = "";
		while(num > 0)
		{
			number = num%2 + number;
			num/=2;
		}
		System.out.println(number);
		scanner.close();
	}

	public static void convertBinDec()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your number:");
		String num = scanner.nextLine();
		double temp = 0.0;
		for(int i = num.length() - 1; i >= 0; i--)
		{
			if(num.charAt(i) == '1')
			{
				temp += Math.pow(2, num.length() - 1 - i);
			}
		}
		int number = (int)temp;
		System.out.println(number);
		scanner.close();
	}

}
