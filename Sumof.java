public class Sumof{
    public static void main(String[] args){
    int number=123456;
       int oddsum=0;
       int evensum=0;
       int rem;
      while(number>0){
           rem=number%10;
           number=number/10;
           if(rem%2!=0){
               oddsum=oddsum*10+rem;
               
               
           }
           else{
               evensum=evensum*10+rem;
               
               
       }
      
    }
    System.out.println("odd numbers:"+oddsum);
    System.out.println("even numbers:"+evensum);
}
}
