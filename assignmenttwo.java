//Cameron Delaney
//Java Assignment 2
//20th December, 2022

//gives the user the ability to type
import java.util.Scanner;

class assignmenttwo
{
	//shows the text presented
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);

		day = 0;

		while (day < 10)

		++day;

		//tells user to input a number(int) to get a day of the week
		System.out.println("Enter a number for a day of the week: ");
		int day= sc.nextInt();


			//when user types in number, its switchs to what number the user has written in
			switch(day)
			{
				//each case associates with a number of a day of the week
				case 1:
				System.out.println("Monday");
				break;

				case 2:
				System.out.println("Tuesday");
				break;

				case 3:
				System.out.println("Wednesday");
				break;

				case 4:
				System.out.println("Thursday");
				break;

				case 5:
				System.out.println("Friday");
				break;

				case 6:
				System.out.println("Saturday");
				break;

				case 7:
				System.out.println("Sunday");
				break;

				//the default pops up when a wrong number is entered
				default:
				System.out.println("Not a valid day number");
				}
	}
}
