package arrays;
import java.util.*;
public class TwoD {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[][] = new int[2][3]; 
		int i,j;
		System.out.println("Enter values");
		for (i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Values");
		for (i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("" +a[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
