interface A{
    static void test(){
        System.out.println("Testing1");
    }
    abstract void test2();
    default void test3(){
        System.out.println("Testing3");
    }
    
}
interface B extends A{
    static void test(){
        System.out.println("Testing1 with interface B");
    }
    abstract void test2();
    default void test3(){
        System.out.println("Testing 3 with interface C");
    }
}
class Inheritance implements B{
    public void test2(){
        System.out.println("Testing 2 with class Inheritance");
        }
    public void test3(){
        System.out.println("Testing 3 with interface C");
    }

}
public class Multilevels{
    public static void main(String[] args){
        Inheritance obj=new Inheritance();
        obj.test2();
        obj.test3();
        B.test();
    }
}
