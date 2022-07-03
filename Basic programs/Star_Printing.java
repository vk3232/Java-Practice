import java.util.*;

public class Star_Printing
{
	public static void main (String [] args)
	{
	System.out.println("Increasing Triangle");
	int n =6;

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		System.out.print("* "); // Space after *
	System.out.println();       //new line after every row
	}
	
	System.out.println("-----------------------------------------------");
	System.out.println("Decreasing Triangle");

	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		System.out.print("* ");
	System.out.println();
	}

	System.out.println("-----------------------------------------------");
	System.out.println("Right Sided Triangle");

	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n-1;j++)
		System.out.print("  "); //first print decreasing triangle of space(two spaces)

		for(int j=1;j<=i;j++)
		System.out.print("* "); //print increasing triangle of *

	System.out.println();
	}
	System.out.println("-----------------------------------------------");
	System.out.println("Left  Sided Triangle");

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<i;j++)
		System.out.print("  "); // first print increasing triangle of space(two spaces)
		for(int j=i;j<=n;j++)
		System.out.print("* "); // print decreasing triangle of *
	System.out.println();
	}

	System.out.println("-----------------------------------------------");
	System.out.println("Hill Pattern");

	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n-1;j++)
		System.out.print("  "); //first print decreasing triangle of space(two spaces)

		for(int j=1;j<i;j++)
		System.out.print("* "); //print increasing triangle of *

		for(int j=1;j<=i;j++)
		System.out.print("* ");
		System.out.println();
	}

	System.out.println("-----------------------------------------------");
	System.out.println("Reverse Hill Pattern");

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<i;j++)
		System.out.print("  "); // first print increasing triangle of space(two spaces)
		for(int j=i;j<=n;j++)
		System.out.print("* "); // print decreasing triangle of *
		for(int j=i;j<n;j++)
		System.out.print("* ");
	System.out.println();
	}

	System.out.println("-----------------------------------------------");
	System.out.println("Diamond Pattern");

	for(int i=1;i<n;i++) //reduce one row
	{
		for(int j=i;j<=n-1;j++)
		System.out.print("  "); //first print decreasing triangle of space(two spaces)

		for(int j=1;j<i;j++)
		System.out.print("* "); //print increasing triangle of *

		for(int j=1;j<=i;j++)
		System.out.print("* ");
		System.out.println();
	}
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<i;j++)
		System.out.print("  "); // first print increasing triangle of space(two spaces)
		for(int j=i;j<=n;j++)
		System.out.print("* "); // print decreasing triangle of *
		for(int j=i;j<n;j++)
		System.out.print("* ");
	System.out.println();
	}


	}
}
