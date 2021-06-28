package com.patternprogramming;

public class Pattern3 {

	public static void main(String[] args) 
	{
		for(int j=1;j<=5;j++)
		{
			for(int k=1;k<=5;k++)
			{
				if(j==1|| j==5 || k==1 || k==5)
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


