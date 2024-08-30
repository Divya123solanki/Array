public class Arraygfg {
    public static int maxWater(int[] a,int n){
        int res=0;
        for(int i=1;i<n-1;i++){

            int left=a[i];
            for(int j=0;j<i;j++){
                left=Math.max(left,a[j]);
            }

                int right=a[i];
                for(int j=i+1;j<n;j++){
                    right=Math.max(right,a[j]);
                }

                res +=Math.min(left,right)-a[i];
            }
            return res;
        }
       public static void main(String args[]){
       int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
       int n=a.length;
       System.out.print(maxWater(a,n));
    }
}
  

