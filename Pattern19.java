package com.patternprogramming;

public class Pattern19 {

	public static void main(String[] args) 
	{
		char ch1='A';
		char ch2='a';
		
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=5;j++)
	{
		if(j>=i)
		{
			System.out.print(ch1++ +""+ch2++);
		}
		
	}
	System.out.println();
}
	}

}
