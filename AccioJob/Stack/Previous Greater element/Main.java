
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] prevGreater(long[] arr, int n)
    { 
        //Write code here and print output   
		Stack<Integer> st=new Stack<>();
		long ans[]=new long[n];
		for (int i=n-1;i>=0;i--){
			while (st.size()>0 && arr[st.peek()]<arr[i]){
				int ind=st.pop();
				ans[ind]=arr[i];
			}
			st.push(i);
		}
		while  (st.size()!=0){
			ans[st.pop()]=-1;
		}
		return ans;
    } 
}
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().prevGreater(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}
