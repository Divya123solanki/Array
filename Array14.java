 import java.util.*;
 class Array14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,n,temp;
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements");
         for ( i = 0; i < n; i++) {
             a[i]=sc.nextInt();
         }
         j=n-1;
         i=0;
         while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
         }
         System.out.println("Elements in reverse order are");
         for ( i = 0; i < n; i++) {
             System.out.println(a[i]+" ");
         }
        } 
    }
    