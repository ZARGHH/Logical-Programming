package com.patternprogramming;

public class Pattern16 {

	public static void main(String[] args)
	{
for(int i=1;i<=5;i++)
{	int count=1;
for(int j=1;j<=5;j++)
{
	if(i+j>=6)
	{
		System.out.print(count++ + " ");
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
