import java.util.Scanner;

public class highest {
	public static void main(String[] args){
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any three numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c){
			System.out.println(a + " is the highest number");
		}
		else if(b>a && b>c){
			System.out.println(b + " is the highest number");
		}
		else{
			System.out.println(c + " is the highest number");
		}
			
	}

}
