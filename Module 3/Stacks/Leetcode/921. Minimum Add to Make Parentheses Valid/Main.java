class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Character> st=new Stack<>();
        // for (int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if  (st.size()>0 && ch==')' && st.peek()=='('){
        //         st.pop();
        //     }
        //     else st.push(ch);
        // }
        // return st.size();

        int count=0,ans=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='(') count++;
            else count--;
            if (count==-1){
                ans++;
                count++;
            }
        }
            return count+ans;
         
    }

}