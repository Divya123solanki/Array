 class Array5 {
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        int pos=3;
        for(int i=a.length-1;i>pos;i--){
            a[i-1]=a[i];
        }
        a[pos-1]=a[pos];
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i-1]);
        }
    }
}
