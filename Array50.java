// Sort the array of 0's, 1's and 2's
class Array50 {
    public static void main(String[] args) {
        int a[]={2,1,0,0,1,0,0,2,1,2};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
