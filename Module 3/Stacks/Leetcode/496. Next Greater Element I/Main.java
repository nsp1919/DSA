class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int nger []=new int[nums2.length];
        for (int i=0;i<nums2.length;i++){
            while (st.size()>0 && nums2[i]>nums2[st.peek()]){
                nger[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        while (st.size()!=0){
            nger[st.pop()]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums2.length;i++){
            map.put(nums2[i],nger[i]);
        }
        int ans[]=new int[nums1.length];
        for (int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }

}