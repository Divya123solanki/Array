 //Find pick element of the array 
 class Array8 {
    public static void main(String args[]){
        int a[]={3,6,8,2,4,9,6};
        int n=a.length;
        if(n==1){
            System.out.print(a[0]);
        }
      else if(a[0]>a[1]){
        System.out.print(a[0]);
        
       }
       else if(a[a.length-1]>a[a.length-2]){
        System.out.print(a[a.length-1]);
        
       }
       else{
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]){
                System.out.print(a[i]);
                break;
            }
           
        }
    }

    }
}
