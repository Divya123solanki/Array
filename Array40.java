//count pair with given sum
class Array40 {
    public static void main(String args[]){
        int a[]={1,5,7,1,4,2,3,3};
        int k=6;
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
