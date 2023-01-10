class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[prices.length];
        for (int i=0;i<prices.length;i++){
            if (st.size()==0){
                st.push(i);
            }
            else {
                while (st.size()>0 && prices[i]<=prices[st.peek()]){
                   int val=st.pop();
                    ans[val]=prices[val]-prices[i];
                }
                st.push(i);
            }
        }
        while (st.size()>0){
            int val=st.pop();
            ans[val]=prices[val]-0;
        }
        return ans;
    }
}