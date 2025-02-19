import java.util.Scanner;
public class Transpose{
    public static void main(String[] args){
        
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        int transpose[][]=new int[m][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j]+" ");
    
            }
               System.out.println();
        }
        
        
    }
}
