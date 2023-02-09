class Solution {
    public int longestValidParentheses(String s) {
        //TC O(N) SC O(N);
        // Stack<Integer> st=new Stack<>();
        // st.push(-1);
        int max=0;
        // for (int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if (ch=='(')
        //     st.push(i);
        //     else{
        //             st.pop();
        //         if (st.size()==0)
        //         st.push(i);
        //        else{
        //            int len=i-st.peek();
        //             max=Math.max(max,len);
        //        } 
        //     }
            
        // }
        // return max;


        //TC O(2N),, SC  O(1);
        int open=0;int close=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='(') open++;
            else close++;
            if (open==close){
                int len=open+close;
                max=Math.max(len,max);
            }
            if (close>open){
                close=0;
                open=0;
            }
        }
        open=0;close=0;
        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if (ch=='(') open++;
            else close++;
            if (open==close){
                int len=open+close;
                max=Math.max(len,max);
            }
            if (open>close){
                open=0;close=0;
            }
        }
        return max;

    }
}