package com.patternprogramming;

public class Pattern14 {

	public static void main(String[] args) 
	{
		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print(count++ +" ");
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
