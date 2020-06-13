// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            GfG g = new GfG();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}
// } Driver Code Ends


class GfG {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int n) {
        int sum =0;
        int end_pos = -1;
        int len=0;
        if(n==1){
            return 0;//array size is 0 means no sub array
        }
        Map<Integer,Integer> hmp = new HashMap<Integer,Integer>();
        hmp.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=(arr[i]==0?-1:1);
            //sum was already identified and finding again means 
            //we founds the subarray of size 0
            if(hmp.containsKey(sum)){
                if(len < i-hmp.get(sum)){
                    len = i-hmp.get(sum);
                    end_pos = i;
                }
            } else {
                //sum found first time
                hmp.put(sum,i);
            }
        }//end of for loop
        if(end_pos==-1){
            return 0;
        } else {
            return len;
        }
    }
}
