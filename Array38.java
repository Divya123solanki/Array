//Swap first and last element
class Array38 {
    public static void main(String args[]){
        int a[]={7,1,2,4,5,6,3};
        int temp;
        temp=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
