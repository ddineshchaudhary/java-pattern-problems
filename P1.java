import java.util.Scanner;
public class P1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
		  for(int j=0;j<n;j++)
		  {
		     if(i==0||j==0||i==n-1||j==n-1)
		     {
		      System.out.print("* ");
		     }
		     else
		     {
		      System.out.print("  ");
		     }
		  }
		  System.out.println();
		}
	}
}
