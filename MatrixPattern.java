package com.patternprogramming;
import java.util.Scanner;

public class MatrixPattern {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a=10;
		for(m=0;m<=n;m++)
		{
			for(n=0;n<=a;n++)
			{
				System.out.print(a++ + "");
			}
			System.out.println();
		}
	}

}
