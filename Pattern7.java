package com.patternprogramming;

public class Pattern7 {

	public static void main(String[] args) 

	{
		char count='A';
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}

}

