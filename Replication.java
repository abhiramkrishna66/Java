public class Replication{
    public static void main(String[] args){
        int arr[]={3,2,3,1,2,9};
       
        for(int i=0;i<arr.length;i++){
             boolean duplicates=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    duplicates=true;
                    continue;
                }
                
            }
            if(!duplicates){
                System.out.print(arr[i]);
            }
        }
    }
}
