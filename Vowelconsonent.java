import java.util.Scanner;

public class Vowelconsonent{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		char ch;
		System.out.println("enter any letter;");
		ch =input.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println("vowel");
		}else{
			System.out.println("consonent");
		}
	   	
		
	}
	
}