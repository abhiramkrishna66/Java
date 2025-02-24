abstract class declare{
    final int member;
    static int varb;
    declare(int value){
    member=value;
}
}
 class initialize extends declare{
     initialize(){
         super(10);
         varb=5;
     }
 }
 public class finalkey{
     public static void main(String[] args){
         initialize obj=new initialize();
        System.out.println(obj.member);
     }
     
 }
