class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums.length];
        for (int i=nums.length-2;i>=0;i--){
            while (st.size()>0 && nums[i]>=st.peek()){
                st.pop();
            }
            st.push(nums[i]);
        }
        for (int i=nums.length-1;i>=0;i--){
            
            while (st.size()>0 && nums[i]>=st.peek()){
                st.pop();
            }
            if (st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(nums[i]);
        }
        return ans;
    }
}