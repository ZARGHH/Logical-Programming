package com.patternprogramming;

public class Pattern13 {

	public static void main(String[] args) 
	{
		int count=1;
		for(int k=1;k<=4;k++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j>=k)
				{
					System.out.print(count++ +" ");
				}
			}
			System.out.println();
		}

	}

}
