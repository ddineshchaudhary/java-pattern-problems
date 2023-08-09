import java.util.Scanner;
public class P7
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
		  for(int k=1;k<=i;k++)
		  {
		    System.out.print(" ");
		  }
		  for(int j=0;j<n;j++)
		  {
		    System.out.print("* ");
		  }
		  System.out.println();
		}
	}
}
