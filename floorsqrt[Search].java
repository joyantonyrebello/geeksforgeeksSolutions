// { Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			SquareRoot obj = new SquareRoot();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class SquareRoot
{
     long floorSqrt(long x)
	 {
	    if(x==0 || x==1)
	        return x;
		long start = 1;
		long end = x;
		long ans = 0;
		while(start<=end){
		    long mid = (start+end)/2;
		    if(mid*mid==x)
		        return mid;
		    if(mid*mid < x){
		        start = mid+1;
		        ans=mid;//used to store floor value
		    } else {
		        end=mid-1;
		    }
		}//end of while loop
		return ans;
	 }
}
