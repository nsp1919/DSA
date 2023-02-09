class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        char[] ch=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='(') st.push(i);
            else if (ch[i]==')' && st.size()>0) st.pop();
            else if (ch[i]==')' && st.size()==0){
                ch[i]='.';
            }
        }
        while (st.size()>0){
            ch[st.pop()]='.';
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<ch.length;i++){
            if (ch[i]!='.'){
                sb.append(ch[i]);
            }

        }
        return sb.toString();
        // char[] ch=s.toCharArray();
        // int count=0;
        // for (int i=0;i<ch.length;i++){
        //     if (ch[i]=='(') count++;
        //     else if (ch[i]==')'){
        //         if (count>0) count--;
        //         else ch[i]=0;
        //     }

        // }
        // count=0;
        // for (int i=ch.length-1;i>=0;i--){
        //     if (ch[i]==')') count++;
        //     else if (ch[i]=='('){
        //         if (count>0) count--;
        //         else ch[i]=0;
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // for (int i=0;i<ch.length;i++){
        //     if (ch[i]!=0){
        //         sb.append(ch[i]);
        //     }
        // }
        // return sb.toString();
    }
}