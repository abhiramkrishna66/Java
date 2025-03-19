import java.util.Arrays;

public class SpiralMatrix {
    public static int[] spiralOrder(int[][] matrix,int m,int n){
        int[] result=new int[m*n];
        int index=0;
        int top=0,left=0,right=n-1,bottom=m-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result[index++]=matrix[top][i];
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result[index++]=matrix[i][right];
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                result[index++]=matrix[bottom][i];
            }
            bottom--;
        }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result[index++]=matrix[i][left];
                }
                left++;
            }
        }
        return result;

        }

    
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int result[]=spiralOrder(matrix, 3, 3);
        System.out.println("Spiral order: " + Arrays.toString(result));
    }
}

