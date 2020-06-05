/*
Remove duplicate elements from sorted Array
Given a sorted array A of size N. The function remove_duplicate takes two arguments . The first argument is the sorted array A[ ] and the second argument is 'N' the size of the array and returns the size of the new converted array A[ ] with no duplicate element.

Input Format:
The first line of input contains T denoting the no of test cases . Then T test cases follow . The first line of each test case contains an Integer N and the next line contains N space separated values of the array A[ ] .

*/

// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int a[] = new int[N];
			for(int i=0; i<N; i++)
				a[i] = sc.nextInt();

			GfG g = new GfG();
			int n = g.remove_duplicate(a,N);

			for(int i=0; i<n; i++)
				System.out.print(a[i]+" ");

			System.out.println();

			T--;
		}
	}
}// } Driver Code Ends


class GfG
{
	/*You are required to complete this function */
	int remove_duplicate(int a[], int n)
	{
		int j=0;
		int []temp = new int[a.length];

		for(int i=0;i<n-1;i++){
			if(a[i] != a[i+1]){
				temp[j++] = a[i];
			}
		}
		//copy last element leftover
		temp[j++] = a[n-1];
		//copy temp content to a[]
		for(int i=0;i<j;i++){
			a[i] = temp[i];
		}
		return j;
	}
}
