import java.util.*;
class Array17 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,row,col;
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
        System.out.println("Enter the no of columns");
        col=sc.nextInt();
        int[][] mat=new int[row][col];
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the matrix");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(mat[i][j]+"\t");

            }
            System.out.println("");
        }
    }
}
