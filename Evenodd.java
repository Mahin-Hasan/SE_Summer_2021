import java.util.Scanner;

public class Evenodd{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	
	int number;
	
	System.out.println("enter number" );
	number = input.nextInt();
    if(number%2==0){
		System.out.println("the number is even");
	}
		else{
			System.out.println("the number is odd");
		}
	
	}
}