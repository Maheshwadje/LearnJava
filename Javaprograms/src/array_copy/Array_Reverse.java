package array_copy;

import java.util.Arrays;

public class Array_Reverse 
{
	public static void main(String[] args) 
	{
		int age[]= {17,98,54,8,96};//given array
		int reverseage[]=new int[age.length];//
		int k=0;
	for(int i=age.length-1;i>=0;i--)
	{
		reverseage[k]=age[i];
		k++;
	}
	System.out.println(Arrays.toString(age));
	System.out.println(Arrays.toString(reverseage));
	}

}  
