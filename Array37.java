//Find the occurence of an integer number in array 
class Array37 {
    public static void main(String args[]){
        int a[]={1,2,3,4,2,2,2,2};
        int count=0;
        int n=2;
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
