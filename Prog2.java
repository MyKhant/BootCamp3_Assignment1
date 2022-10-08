/**
Create a Java method
static int min (int[] arrayOfInts)
(in a class Prog2 8) that outputs the minimum of an array of ints.
Create a class Prog2 8Test that tests your method on the following input array
[2, -21, 3,
3, 45, 0. 12.
45, 0, 12, 18, 6, 3, 1, 0,
-221
**/
public class Prog2{

	public static int min(int [] arrayOflints){
		int temp;
		for(int i=0; i<arrayOflints.length; i++){
			for(int j=i+1; j<arrayOflints.length; j++){
				if(arrayOflints[i]>arrayOflints[j]){
					temp=arrayOflints[i];
					arrayOflints[i]=arrayOflints[j];
					arrayOflints[j]=temp;
				}
			}
		}
		return arrayOflints[0];
	}
	public static void main(String[] args) {
		int [] arrayOflints={2,-21,3,3,45,0,12,45,0,12,45,12,18,6,3,1,0,-221};
		System.out.println("Minimum value : "+min(arrayOflints));
	}
}
