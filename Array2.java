 //kth largest element find
 class Array2 {
    public static void main(String args[]){
        int a[]={5,6,3,7,8,2,9};
        int temp=0;
        int k=4;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                System.out.print(a[i]);
                break;
            }
        }
    }
}
