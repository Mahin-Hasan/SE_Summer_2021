import java.util.Scanner;

public class ArithmeticDemouser{
  
   public static void main(String[]args){
   Scanner input= new Scanner(System.in);
   
   int num1,num2,result;
   System.out.println("enter 1st no:");
   num1=input.nextInt();
   
   System.out.println("enter 2st no:");
   num2=input.nextInt();
   
   
 
   
   result = num1+num2;
   System.out.println("Sum =" +result);
   
   result = num1-num2;
   System.out.println("Sub =" +result);
   
   result = num1*num2;
   System.out.println("multipy =" +result);
   
   result = (double)num1/num2;
   System.out.println("divide =" +result);
   
   result = num1%num2;
   System.out.println("remainder =" +result);
   }
}