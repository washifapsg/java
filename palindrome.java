package placement;
import java.util.*;
public class palindrome {
	public  static int rev(int n) {
		int rev_n=0;
		while(n>0)
		{
			rev_n=rev_n*10+n%10;
			n=n/10;	
		}
		return rev_n;
		
	}
	public static void main(String args[] )
	{
		System.out.println("enter a value to check palindrome");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=rev(x);
		if(x==y)
		{
			System.out.println("given value is palindrome");
		}
		else
		{
			System.out.println("given value is not palindrome");
		}
		
	}
}
