 //Alternate negative positive print
 class Array7 {
    public static void main(String args[]){
        int a[]={9,4,-2,-1,5,8,-5,-3,2};
        {
            int n=a.length;
            int temp=0;
            for(int i=0;i<n;i++){
                int neg=0,pos=0;
                for(int j=0;j<n;j++){
                    if(a[j]>0){
                      neg++;
                    }
                    else if(a[j]<0){
                        pos++;
                    }
                    if(neg>1){
                        temp=a[j-1];
                        a[j-1]=a[j];
                        a[j]=temp;
                    }
                }
                System.out.print(" "+a[i]);
            }
        }
    }
}
