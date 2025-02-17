public class ReOrderArray{
    public static void main(String[] args){
        int arr[]={1,2,4,3,5,0,6,7,9,0,5,0,3};
        int prev=0;
        int c=0;
    //     for(int i=0;i<arr.length;i++){
    //       if(arr[i]==1){
    //              c++;
    //       }
    //          if(arr[i]==0){
    //             prev=Math.max(c,prev);
    //           c=0;
    //          }
            
    //  }
 System.out.println(prev);
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            prev=arr[i];}
        else if(arr[i]==0){
                continue;
            }
            System.out.print(prev);
        }
      
    
    for(int j=0;j<arr.length;j++){
        if(arr[j]==0){
            c=arr[j];
        }
        else if(arr[j]>0){
            continue;
        }
        System.out.print(c);
    }
       
    }
}
    
    
