public class Clockwise {
    public static void main(String[] args) {
        int m=0;
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix.length-1;j>=0;j--){
                System.out.print(matrix[j][m]+" ");
            
        
        if(j==0){
            System.out.println();
            m++;
        }
    }
}
}
}
