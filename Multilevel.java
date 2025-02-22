class Supermost{
    private int a=10;
    private void supermost(){
        System.out.println("Private member"+a);
    }
    public void showprivate(){
        supermost();
    }
}

    

class Super extends Supermost{
    protected int b=15;
    protected void sooper(){
        System.out.println("Protected member"+b);
    }
}
class Sub extends Super{
    int c=20;
    void display(){
        System.out.println("Default member"+c);
       
    }
}
public class Multilevel{
    public static void main(String[] args){
        Sub obj=new Sub();
        obj.display();
        obj.sooper();
        obj.showprivate();
        
    }
}
