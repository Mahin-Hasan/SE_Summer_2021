import java.util.Scanner;

public class Circle{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	
	double radius,area;
	
	System.out.println("enter radius" );
	radius = input.nextDouble();
	
	area = 3.1416*radius*radius;
	System.out.println("area of circle"+ area);
	
	
}
}