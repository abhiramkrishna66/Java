interface problem{
 static void problem1(){
     System.out.print("Interface");
 }
 void problem2();
}
 
  class test implements problem{
    public void problem(){
        System.out.println("implements 1");
    }
    public void problem2(){
        System.out.println("implements 2");
    }
}
public class interfaceprb{
    public static void main(String[] args){
        test obj=new test();
        obj.problem();
        obj.problem2();
        problem.problem1();
    }
}
