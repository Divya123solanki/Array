 //Ask user to enter values in array
 import java.util.Scanner;
 class Array44 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter array values");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("array");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
        sc.close();
    }
    }
}
