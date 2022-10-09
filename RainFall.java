/**
Design a program that uses nested loops to collect data and calculate the average
rainfall over a period of years. The program should first ask for the number of years.
The outer loop will iterate once for each year. The inner loop will iterate twelve
times, once for each month. Each iteration of the inner loop will ask the user for the
inches of rainfall for that month. After all iterations, the program should display the
number of months, the total inches of rainfall, and the average rainfall per month
for the entire period.
**/
//Myo Khant Kyaw
import java.util.Scanner;
public class RainFall{

		static double totalRainfall;
		static int totalNumOfMonths;
		static double averageRainfallPerMonth;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numOfMonths=12;
		
		System.out.print("Enter number of years : ");
		int numOfYears=sc.nextInt();
		System.out.println("You entered "+numOfYears+" years.");
		for(int i=0; i<numOfYears; i++){
			System.out.println("Year "+(i+1)+" >>>");
			for(int j=0; j<numOfMonths; j++){
				System.out.println("How much rainfall (inches)");
				System.out.print("For month "+(j+1)+" : ");
				double rainfall=sc.nextDouble();
				totalRainfall+=rainfall;
				totalNumOfMonths++;

			}
		}
		averageRainfallPerMonth=totalRainfall/totalNumOfMonths;
		System.out.println("Total number of months = "+totalNumOfMonths);
		System.out.println("Total inches of rainfall = "+totalRainfall);
		System.out.println("Average rainfall per month = "+averageRainfallPerMonth);
	}
}
