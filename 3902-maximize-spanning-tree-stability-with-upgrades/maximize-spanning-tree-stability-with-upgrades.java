class Solution {
    int[] p, r;

    int find(int x){
        return p[x]==x ? x : (p[x]=find(p[x]));
    }

    boolean union(int a,int b){
        int pa=find(a), pb=find(b);
        if(pa==pb) return false;
        if(r[pa]<r[pb]) p[pa]=pb;
        else if(r[pb]<r[pa]) p[pb]=pa;
        else{ p[pb]=pa; r[pa]++; }
        return true;
    }

    void init(int n){
        p=new int[n]; r=new int[n];
        for(int i=0;i<n;i++) p[i]=i;
    }

    public int maxStability(int n,int[][] edges,int k){
        int max=0;
        for(int[] e:edges) max=Math.max(max,e[2]);

        int l=0,h=max*2,ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(check(n,edges,k,mid)){ ans=mid; l=mid+1; }
            else h=mid-1;
        }
        return ans;
    }

    boolean check(int n,int[][] edges,int k,int t){
        init(n);
        int used=0;

        for(int[] e:edges)
            if(e[3]==1){
                if(e[2]<t || !union(e[0],e[1])) return false;
            }

        for(int[] e:edges)
            if(e[3]==0 && e[2]>=t) union(e[0],e[1]);

        for(int[] e:edges)
            if(e[3]==0 && e[2]<t && 2*e[2]>=t && used<k)
                if(union(e[0],e[1])) used++;

        int root=find(0);
        for(int i=1;i<n;i++)
            if(find(i)!=root) return false;

        return true;
    }
}