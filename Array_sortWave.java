 import java.util.Arrays;
 class Array_sortWave {
    void swap(int arr[], int a, int b){
       int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
    }
    void sortInWave(int arr[],int n){
      //Sort the input array
        Arrays.sort(arr);
        //Swap adjacent elements
        for(int i=0;i<n-1;i+=2)
        swap(arr, i, i+1);
    }
    public static void main(String args[]){
       Array_sortWave ob=new Array_sortWave();
       int arr[]={10,90,49,2,1,5,23};
       int n=arr.length;
       ob.sortInWave(arr,n);
       for(int i:arr)
       System.out.print(i+" ");

    }
}
