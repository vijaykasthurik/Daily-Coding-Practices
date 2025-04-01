class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int[]vj=new int[n+1];
        vj[1]=1;
        vj[2]=2;
        for(int i=3;i<=n;i++){
            vj[i]=vj[i-1]+vj[i-2];
        }
        return vj[n];
    }
}
