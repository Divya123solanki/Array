 class Array12 {
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={2,3,4,5};
        int temp[]=new int[a.length];
        int temp1[]=new int[b.length];
        int k=0,L=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]!=a[i+1] ){
                 temp[k]=a[i];
                 k++;
                }
                else if (a[j]!=a[j+1]) {
                    temp1[L]=a[j];
                    L++;

                    
                }
            }
            temp[k]=a[a.length-1];
            
            }
        }
    }

