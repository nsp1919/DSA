class StockSpanner {
    class pair{
        int data;
        int index;
        pair(int data,int index){
            this.data=data;
            this.index=index;
        }
    }
    Stack<pair> st;
    int span[];
    int index;
    public StockSpanner() {
        st=new Stack<>();
        index=0;
    }
    public int next(int price) {
        if (st.size()==0){
        st.push(new pair(price,index++));
        return 1;
        }
            while (st.size()>0 && st.peek().data<=price){
                st.pop();
            }
            int ans;
            if (st.size()==0) ans=index+1;
            else ans=index-st.peek().index;
            st.push(new pair(price,index++));      
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */