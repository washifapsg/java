package placement;
import java.util.*;
public class Swaping_without_3rd_variable {
	public static void main(String args[])
	{
		int x;
		int y;
		System.out.println("enter x value");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter y value");
		Scanner sc1= new Scanner(System.in);
		y=sc1.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Swaped value \nx is "+x+"\ny is "+y);
	}
}
