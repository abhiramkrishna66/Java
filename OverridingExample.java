import java.util.Scanner;
class Parent{
    Scanner sc=new Scanner(System.in);
    public void method(){
        System.out.println("This is a public method");
    }
    private void function(){
        System.out.println("This is a private method");
    }
    protected void func(){
        System.out.println("This is a protected method");
    }
    void met(){
        System.out.println("This is a default method");
    }
    static void funct(){
        System.out.println("This is a static method");
    }
}

class Child extends Parent{
     public void method(){
        System.out.println("Override public method");
    }
    public void function(){
        System.out.println("Override private method");
    }
    protected void func(){
        System.out.println("Override protected method");
    }
    void met(){
        System.out.println("Override default method");
    }
    static void funct(){
        System.out.println("Override static method");
    }
}
    
public class OverridingExample{
    public static void main(String[] args){
        Child obj=new Child();
        obj.method();
        obj.func();
        obj.funct();
        obj.met();
        obj.function();
    }
}
