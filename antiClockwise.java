public class antiClockwise {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
            System.out.print(matrix[j][m]+" ");
            if(j==matrix.length-1){
                System.out.println();
                m--;
            }
        }
    }
    
}
}
