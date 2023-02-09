class Solution {
    public int largestRectangleArea(int[] a) {
        Stack<Integer> st=new Stack<>();
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            while (st.size()>0 && a[i]<a[st.peek()]){
                int r=i;
                int l=-1;
                int c=st.pop();
                if (st.size()>0) l=st.peek();
                int width=r-l-1;
                int area=width*a[c];
                max=Math.max(max,area);
            }
            st.push(i);
        }
        while (st.size()>0){
            int r=a.length;
            int l=-1;
            int c=st.pop();
            if (st.size()>0) l=st.peek();
            int width=r-l-1;
            int area=width*a[c];
            max=Math.max(max,area);

        }
        return max;
    }
}