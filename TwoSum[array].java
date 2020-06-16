// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] nx = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            if (sln.keypair(a, n, x) == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // A[] : the input array of positive integers
    // N : size of the array arr[]
    // X : the required sum
    public boolean keypair(int[] a, int n, int x) {
        Set<Integer> s = new HashSet<Integer>();
        if(n<=1)
            return false;
        int temp=0;
        for(int i=0;i<n;i++){
            temp = x-a[i];//sum-a[i]
            if(s.contains(temp)){
                return true;
            } else {
                s.add(a[i]);
            }
        }//end of for loop
        return false;
    }
}
