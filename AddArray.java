public class AddArray{
    public static void main(String[] args){
        int arr1[]={5,1,3};
        int arr2[]={9,7,7,7};
        int carry=0;
        int maxlength=Math.max(arr1.length,arr2.length);
        int result[]=new int[maxlength];
        for(int i=0;i<maxlength;i++){
            int num1=i<arr1.length?arr1[i]:0;
            int num2=i<arr2.length?arr2[i]:0;
            int sum=num1+num2+carry;
            carry=sum/10;
            result[i]=sum%10;
        }
    System.out.println("Array Addition:");
    for(int digit:result){
        System.out.print(digit);
    }
}
}
