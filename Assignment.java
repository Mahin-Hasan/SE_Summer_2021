import java.util.Scanner;


public class Assignment {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int x,y;
        x=input.nextInt();
        y=input.nextInt();
        
        x+=y;
        System.out.println("add: "+x);
        x-=y;
        System.out.println("sub: "+x);
        x*=y;
        System.out.println("mul: "+x);
        x/=y;
        System.out.println("div: "+x);
        x%=y;
        System.out.println("mod: "+x);
        
        
    }
    
}