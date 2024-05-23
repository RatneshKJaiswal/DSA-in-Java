package Array;
import java.util.*;
public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter in "+i+" row "+j+" column : ");
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the number to be searched : ");
        int sch=sc.nextInt();
        int fin=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             if(matrix[i][j]==sch){
                System.out.println("The input "+sch+" is present at row number "+(i+1)+" column number "+(j+1));
                ++fin;
             }
            }
        }
        if(fin==0) System.out.println("Not Found");
    }
}
