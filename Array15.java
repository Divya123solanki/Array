import java.util.*;
 class Array15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,temp;
        System.out.println("Enter the no of elements");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements");
        for ( i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Original array");
        for ( i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        //shifting array elements
        temp=a[n-1];
        for ( i = n-1; i > 0; i--) {
            a[i]=a[i-1];
        }
        a[0]=temp;
        System.out.println("new array after rotating one position of the aray");
        for ( i = 0; i < n; i++) {
            System.out.println(a[i]+" ");
        }

    }
}
