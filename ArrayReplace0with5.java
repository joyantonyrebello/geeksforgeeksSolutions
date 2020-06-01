/*You are given an integer N. You need to convert all zeroes of N to 5.

Input Format:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a single integer N denoting the number.

Output Format:
For each test case, there will be a new line containing an integer where all zero's are converted to 5.
*/
// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int num) {
    int digit = 0;
    if(num==0)
        return 0;
    digit = num%10;
    if( digit== 0)
        digit = 5;
    return convertfive(num/10)*10 + digit;
    }
}
