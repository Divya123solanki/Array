import java.util.*;
class Array20 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,row,col;
        float sum=0,average;
        System.out.println("Enter the no of rows");
        row=sc.nextInt();
        System.out.println("Enter the no columns");
        col=sc.nextInt();
        int[][] mat=new int[row][col];
        System.out.println("Enter the elements of the matrx");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat[i][j]=sc.nextInt();

            }
        }
        System.out.println("The elements of the matrix");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.println(mat[i][j]+"\t");
            }
            System.out.println("");
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                sum=sum+mat[i][j];
            }
        }
        average=sum/(row*col);
        System.out.println("Average of the elements of the matrix"+average);
    }
}
