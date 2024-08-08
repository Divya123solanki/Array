//second smallest element find
class Array3 {
    public static void main(String args[]){
        int a[]={2,4,7,6,8,9};
        int temp=0;
        int k=5;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
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
