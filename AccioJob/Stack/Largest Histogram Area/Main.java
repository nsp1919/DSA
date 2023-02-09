import java.util.*;
import java.lang.*;
import java.io.*;



class Solution
{
	static int[] left(long hist[],int n){
		int nseli[]=new int[n];
		Stack <Integer> st=new Stack<>();
		for (int i=n-1;i>=0;i--){
			while (st.size()>0 && hist[i]<hist[st.peek()]){
				int ind=st.pop();
				nseli[ind]=i;
			}
			st.push(i);
		}
		while (st.size()>0){
			int idx=st.pop();
			nseli[idx]=-1;
		}
		return nseli;
	}
	static int[] right(long hist[],int n){
		int nseri[]=new int[n];
		Stack <Integer> st=new Stack<>();
		for (int i=0;i<n;i++){
			while (st.size()>0 && hist[i]<hist[st.peek()]){
				int ind=st.pop();
				nseri[ind]=i;
			}
			st.push(i);
		}
		while (st.size()>0){
			int idx=st.pop();
			nseri[idx]=n;
		}
		return nseri;
	}
      public static long maximumArea(long hist[], long n){
	//Your code here  
		  int []nseli=left(hist,(int)n);
		  int []nseri=right(hist,(int)n);
		  long maxarea=0;
		  for (int i=0;i<n;i++){
			  long width=nseri[i]-nseli[i]-1;
			  long height=hist[i];
				  long area=height*width;
			  maxarea=Math.max(maxarea,area);
		  }
		  return maxarea;
    }

}
class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}


