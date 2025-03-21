public class First_and_Last_pos {
    public static void main(String[] args) {
        int left=0;
        int right=0;
        int[] nums={1,3};
        int target=1;
        if(nums.length==0){
            int[] arr={-1,-1};
            for(int digits:arr){
                System.out.print(digits+" ");
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                left=i;
                break;
            }
            else{
                left=-1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                right=i;
                break;
            }
            else{
                right=-1;
            }
        }
        int[] arr={left,right};
    for(int digits:arr){
        System.out.print(digits+" ");
    }
    }
}
