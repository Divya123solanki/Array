 class Array28 {
    public static void main(String args[]){
        int a[]={2,3,5,7,-7,5,8,-5};
        int max=1;
        int index1=0;
        int index2=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(max<(a[i]*a[j])){
                    max=a[i]*a[j];
                    index1=a[i];
                    index2=a[j];
                }
            }
        }
            System.out.println(index1+"*"+index2+"="+max);
        }

    }

