public class RecursiveAdd{
    public static void main(String[] args){
        int n=5;
        int k=4;
        int m=n;
        int sum=0;
        
        for(int i=0;i<k;i++){
            if(i==0){
                sum+=n;
                System.out.print(n+"+");
                
                
            }
            else {
            
              n=(n*10)+m;
              sum+=n;
            System.out.print(n+"+");
            
        }
        
    }
    System.out.print("="+sum);
}
}
