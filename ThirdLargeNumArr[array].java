
// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;




class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long n =sc.nextLong();
			Long arr[] = new Long[(int)n];
			for(long i=0;i<n;i++)
				arr[(int)i] = sc.nextLong();
			GfG g = new GfG();
			System.out.println(g.thirdLargest(arr));
		t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    long thirdLargest(Long a[])
    {
        //no 3rd max element
        if(a.length<3){
            return -1;
        }
        long max1=Integer.MIN_VALUE;
        long max2=Integer.MIN_VALUE;
        long max3=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            //find max1
            if(a[i]>max1){
                max3=max2;
                max2=max1;
                max1=(long)a[i];
            } 
            //find max2
            else if(a[i]>max2){
                max3=max2;
                max2=(long)a[i];
            } 
            //find max3
            else if(a[i]>max3){
                max3=(long)(a[i]);
            }
        }
        return max3;
    }
}
