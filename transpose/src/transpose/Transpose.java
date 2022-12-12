package transpose;


import java.util.Scanner;


public class Transpose {

    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("inter the num of rows");
		int r=sc.nextInt();
		System.out.println("inter the num of columns");
		int c =sc.nextInt();
		int matrix[][]=new int [r][c];
		System.out.println("inter the matrix items");
		for (int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        matrix[i][j]=sc.nextInt();
		    }
		}
		for (int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println("The transpose matrix");
		for (int i=0;i<c;i++)
		{
		    for(int j=0;j<r;j++)
		    {
		        System.out.print(matrix[j][i]+" ");
		    }
		    System.out.println();
		}
		
	}
    
}
