//Match specific pattern

// { Driver Code Starts
import java.util.*;
public class MSP
{	
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-- != 0)
		{
			int n=sc.nextInt();
			ArrayList<String> s = new ArrayList<String>(n);
			for (int i=0;i<n;i++)
			    s.add(sc.next());
			String tt;
			tt=sc.next();
			GfG g=new GfG();
			ArrayList<String> res =g.findMatchedWords(s, tt);
			Collections.sort(res);
			for (int i = 0;i < res.size();i++)
			    System.out.print(res.get(i)+" ");
			System.out.println();

		}
	}
}// } Driver Code Ends


/*Complete the provided function*/

class GfG
{
/* The function returns an array of strings 
present in the dictionary which matches
the string pattern.
You are required to complete this method */
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{   
	    ArrayList<String> outputList = new ArrayList<String>();
	    if(dict== null || dict.size()==0)
	        return outputList;
	        
	    //map pattern to hash integer values
	    int pattCount = 0;
	    String pattHashValue = "";
	    Map<Character,Integer> pattHmp = new HashMap<Character,Integer>();
	    for(char ch : pattern.toCharArray()){
	        if(!pattHmp.containsKey(ch))
	           pattHmp.put(ch,++pattCount); 
	         //build pattern hash value
	         pattHashValue+=pattHmp.get(ch);
	    }
	    
	    
	    for(String s : dict){
	       Map<Character,Integer> inpHmp = new HashMap<Character,Integer>(); 
	       int inpCount = 0;
	       String inpHashValue = "";
	       for(char ch : s.toCharArray()){
	        if(!inpHmp.containsKey(ch))
	           inpHmp.put(ch,++inpCount); 
	         //build pattern hash value
	         inpHashValue+=inpHmp.get(ch);
	       }
         //compare with patern's hash, if matched add to list for output
	       if(pattHashValue.equals(inpHashValue)){
	           outputList.add(s);
	       }
	    }
	    
	  return outputList;
	}
}
