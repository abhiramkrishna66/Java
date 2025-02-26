abstract class  Abs{
    abstract void Abstract();
    public void NonAbstract(){
        System.out.println("NonAbstract Method");
    }
    abstract class Abst{
        abstract void Abstract2();
        public void NonAbstract2(){
            System.out.println("This is a non abstract method");
        }
    }
}
class Normal extends Abs{
    public void Abstract(){
        System.out.println("abstract method");
    }
    
    
    class Norman extends Abst{ 
        public void Abstract2(){
        System.out.println("Abstract2 method");
        
    }
}
}
public class AbsMain{
    public static void main(String[] args){
        Normal obj=new Normal();
        Normal.Norman obj2 = obj.new Norman();
        obj.Abstract();
        obj2.Abstract2();
        obj.NonAbstract();
        obj2.NonAbstract2();
        
    }
}
