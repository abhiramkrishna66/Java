import java.util.Scanner;
public class ReverseDiagonal{
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns:");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            matrix[i][j]=sc.nextInt();
            }
            }
             for (int i = 0; i < n/2 ; i++) {
                temp=matrix[i][i];
                matrix[i][i]=matrix[n-i-1][n-i-1];
                matrix[n-i-1][n-i-1]=temp;
            }
        
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    }
}
