import java.util.*;
public class Matrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("The Matrix is here");
		int n=scan.nextInt();
		int A[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter the value at position"+ i +"and"+j);
				A[i][j]=scan.nextInt();
			}
		}
		int a=A[0][0];
		int b=A[0][1];
		int c=A[0][2];
		int d=A[1][0];
		int e=A[1][1];
		int f=A[1][2];
		int g=A[2][0];
		int h=A[2][1];
		int i=A[2][2];
		
		int z=(a*((i*e)-(f*h))-(b*((d*i)-(f*g)))+(c*((h*d)-(e*g))));
		System.out.println("The Dterminant of matrix is :" +z);
	}
}
