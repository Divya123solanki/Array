//To find largest and smallest element
class Array47 {
    public static void main(String[] args) {
        int a[]={1,3,5,0,7,9};
        int largest=0;
        int smallest=0;
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
            else if(smallest>a[i]){
                smallest=a[i];
            }
        }
        System.out.println(largest+" ");
        System.out.println(smallest+" ");
    }
}
