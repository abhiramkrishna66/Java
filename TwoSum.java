public class TwoSum{
    public static void main(String[] args){
        int n=9;
        int arr[]={2,6,5,4,3,7};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(i<j){
                if(arr[i]+arr[j]==n){
                    
                    System.out.println("("+i+","+j+")");
                    count++;
                }
               
            }
            
        }
         
    }
     System.out.println("The Count is:"+count);
}
}
