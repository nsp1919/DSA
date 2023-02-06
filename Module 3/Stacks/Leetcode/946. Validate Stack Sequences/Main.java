class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // Stack<Integer> st=new Stack<>();
        // int ind=0;
        // for (int i=0;i<pushed.length;i++){
        //     st.push(pushed[i]);
        //     while  (st.size()>0 && st.peek()==popped[ind] && ind<popped.length){
        //         st.pop();
        //         ind++;
        //     }
        // } 
        // if (st.size()==0) return true;
        // else return false;
    int i=0;int j=0;
    for (int x:pushed){
        pushed[i]=x;
        i++;
        while (i>0 && pushed[i-1]==popped[j]){
            i--;
            j++;
        }
    }
    return i==0;
    }
}


