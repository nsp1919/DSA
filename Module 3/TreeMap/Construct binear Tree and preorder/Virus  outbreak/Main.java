public class Main {
    Queue<Integer> s1=new ArrayDeque<>();
    Queue<Integer> s2=new ArrayDeque<>();
    int mod=1000000007;
    s1.add(1);
    s2.add(1);
    int s=0;
    for (int i=1;i<n;i++){
        if (i>=x){
            s=s+s1.remove();
            s=s%mod;
        }
        if (i>=y){
            s=s-s2.remove();
            s=s%mod;
        }
        s1.add(s);
        s2.add(s);
    }
    int ans=0;
    while (s2.size()!=0){
        ans+=s2.remove();
        ans=ans%mod;
    }
    return ans%mod;
       
}
