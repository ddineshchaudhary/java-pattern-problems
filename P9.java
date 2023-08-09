import java.util.Scanner;
public class P9
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = s.nextInt();
		int temp=n;
		for(int i=1;i<=n;i++)
		{
		 for(int k=1;k<=n-i;k++)
		 {
		  System.out.print("  ");
		  temp--;
		 }
		 for(int j=1;j<=i;j++)
		 {
		 System.out.print(temp+" ");
		 temp--;
		 }
		 temp=n;
		 System.out.println();
	        }
        }
}
