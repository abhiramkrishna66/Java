public class SumOfEven{
    public static void main(String[] args){
        int number=123456;
        int sum=0;
        String str=Integer.toString(number);
        for(int i=1;i<=str.length()-1;i=i+2){
            char num=str.charAt(i);
             int num2 = Integer.parseInt(String.valueOf(num));
            sum+=num2;
            
        }
        System.out.print(sum);
    }
}
