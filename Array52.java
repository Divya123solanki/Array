 //find particular index value
 class Array52 {
    public static void main(String args[]){
        int a[]={1,2,3,3,4,6,16};
        int count=1;
        int index=a[0];
        int n=6;
        for(int i=1;i<a.length&&count<n;i++){
            if(a[i]!=a[i-1]){
                count++;
                index =a[i];
            }
        }
        System.out.println(index);
    }
}
