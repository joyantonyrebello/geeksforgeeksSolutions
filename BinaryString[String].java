// { Driver Code Starts
import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}

// } Driver Code Ends


class GfG
{
	boolean isBinary(String str)
	{
	   int i=0;
	   int j=str.length()-1;
	   while(i<=j){
	       if((str.charAt(i)!='0'&& str.charAt(i)!='1') ||
	            (str.charAt(j)!='0'&& str.charAt(j)!='1')){
	                return false;
	            }
	            i++;j--;
	   }
	   return true;
	}
}
