/**
In a small company there are five salesmen. Each salesman is supposed to sell three products. Write a
program using a 2D array to print (i) the total sales by each salesman and (ii) total sales of each item.
Sample Output
ENTER THE DATA
*****************
Enter the sales of 3 items sold by salesman 1: 23 23 45
Enter the sales of 3 items sold by salesman 2: 34 45 63
Enter the sales of 3 items sold by salesman 3: 36 33 43
Enter the sales of 3 items sold by salesman 4: 33 52 35
Enter the sales of 3 items sold by salesman 5: 32 45 64
Total Sales By Salesman 1 = 91
Total Sales By Salesman 2 = 142
Total Sales By Salesman 3 = 112
Total Sales By Salesman 4 = 120
Total Sales By Salesman 5 = 141
Total sales of item 1 = 158
Total sales of item 2 = 198
Total sales of item 3 = 250
**/
//Myo Khant Kyaw
import java.util.Scanner;
public class SalesMan{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][] arr=new int[5][3];
		int total=0;
		System.out.println("ENTER THE DATA");
		System.out.println("**************");
		for(int  i=0; i<5; i++){
			System.out.print("Enter the sales of 3 items sold by salesman "+(i+1)+" : ");
			for(int j=0; j<3; j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int a=0; a<5; a++){
			total=0;
			for(int b=0; b<3; b++){
				total+=arr[a][b];
			}
			System.out.println("Total Sales By Salesman "+(a+1)+" = "+total);
		}
		for(int x=0; x<3; x++){
			total=0;
			for(int y=0; y<5; y++){
				total+=arr[y][x];
			}
			System.out.println("Total sales of item "+(x+1)+" = "+total);
		}
	}
}
