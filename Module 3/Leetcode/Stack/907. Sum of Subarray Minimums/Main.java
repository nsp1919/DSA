class Solution {
    public long sumsubarray(int[] a){
        int n=a.length;
		Stack<Integer> st=new Stack<>();
		long total=0;
		int mod=1000000007;
		for (int i=0;i<n;i++){
			while (st.size()>0 && a[i]<a[st.peek()]){
				int r=i;
				int c=st.pop();
public class Main {
    
}
				int l=-1;
				if (st.size()>0){
					l=st.peek();
				}
				long sum=((r-c)*(c-l))%mod;
				total+=(sum*a[c])%mod;
			}
			st.push(i);
		}
			while (st.size()>0){
				int r=n;
				int c=st.pop();
				int l=-1;
				if (st.size()>0){
					l=st.peek();
				}
				long sum=((r-c)*(c-l))%mod;
				total+=(sum*a[c])%mod;
			}
		return (long)total%mod;	
    }
    public int sumSubarrayMins(int[] a) {
        return (int)sumsubarray(a);		
	}
}

