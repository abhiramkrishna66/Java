class Parent{
    private int a=10,b=5;
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
}
class Child extends Parent{
    int c;
    public void display(){
        c=get_a()+get_b();
        System.out.println(c);
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        Child obj=new Child();
        obj.display();
    }
}
