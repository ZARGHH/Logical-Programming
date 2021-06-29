package com.patternprogramming;

public class Pattern8 {

	public static void main(String[] args)
	{
		int count=1;
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=5;b++)
			{
				if(a>=b)
				{
					System.out.print(count++ + " ");
				}
							}
			System.out.println();
		}

	}

}
