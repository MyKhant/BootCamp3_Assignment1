/**The distance a vehicle travels can be calculated as follows:
Distance= Speed Time
For example, if a train travels 40 miles per hour for three hours, the distance
traveled is 120 miles. Design a program that asks the user for the speed of a vehicle
(in miles per hour) and how many hours it has traveled. It should then use a loop
to display the distance the vehicle has traveled for each hour of that time period.
Here is an example of the output:
What is the speed of the vehicle in mph? 40 [Enter]
How many hours has it traveled? 3 [Enter|
Hour
Distance Traveled
1
2
3
40
80
120
**/
//Myo Khant Kyaw
import java.util.Scanner;
public class Travelling{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int distance=0;
		System.out.println("What is the speed of the vehicle in mph? ");
		int speed=sc.nextInt();
		System.out.println("How manny hours has it traveled? ");
		int hour=sc.nextInt();
		if(speed>=0 && hour>=1){
			System.out.println("Hour");
			System.out.println("Distance Traveled");
			for(int i=1; i<=hour; i++){
				System.out.println(i);
			}
			for(int j=1; j<=hour; j++){
				distance+=speed;
				System.out.println(distance);
			}
		}
	}
}
