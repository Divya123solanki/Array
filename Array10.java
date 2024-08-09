 // Intersection of the two array
 class Array10 {
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={3,4,5,6};
        //int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<b.length-1;j++){
                if(a[i]==b[j]){
                    //temp=a[i];
                    System.out.print(" "+a[i]);
                }
                else{
                    //System.out.print("");
                }
            }
            System.out.println();

        }
       // System.out.println();
    }
}
