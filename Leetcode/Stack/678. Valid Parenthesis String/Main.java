public class Solution {
    public boolean checkValidString(String s) {
    //     Stack<Integer> open=new Stack<>();
    //     Stack<Integer> star=new Stack<>();
    //     for (int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         if (ch=='(') open.push(i);
    //         else if (ch=='*') star.push(i);
    //         else {
    //             if (open.size()!=0) open.pop();
    //             else if (star.size()!=0) star.pop();
    //             else return false;
    //         }
    // }
    // while (open.size()!=0){
    //     if (star.size()==0) return false;
    //     if (open.peek()<star.peek()){
    //         open.pop();
    //         star.pop();
    //     }
    //     else return false;
    // }
    // return true;
    int open=0,close=0;
    for (int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if (ch=='('){
            open++;
            close--;
        }
        else if (ch==')'){
            if (open>0)
                open--;
                close++;
        }
        else {
            if (open>0)
                open--;
                close--;
        }
        if (close>0) return false;
    }
    
    return open==0;
    
    }
} {
    
}
