//question - You are given an integer N. Find the largest integer between 1 and 10 (inclusive) which divides N.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int x=0;
		for(int i=1;i<=N;i++){
		    if(N%i==0){
		        if(i<=10){
		            x=i;
		        }
		    }
		}
		System.out.print(x);
	}
}
