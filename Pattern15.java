package com.patternprogramming;

public class Pattern15 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int count=1;
			for(int j=1;j<=5;j++)
			{
			
				if(i>=j)
				{
					System.out.print(count++ +" ");
				}
			}
			System.out.println();
		}

	}

}
