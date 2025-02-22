import java.util.Scanner;
class Shape{
    protected double area;
    public void CalculateArea(){
        System.out.println("Area of Shapes");
        
    }
}
class Square extends Shape{
    private int a;
    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value a:");
        a=sc.nextInt();
    }
    public void CalculateArea(){
        area=a*a;
        System.out.println(" the Area of the Square is"+area);
    }
}
class Circle extends Shape{
    private double a=10;
        public void CalculateArea(){
            area=3.14*a*a;
            System.out.println("The Area of the Circle is:"+area);
        }
    }
    public class Overriding{
        public static void main(String[] args){
        Square obj=new Square();
         obj.get();
        obj.CalculateArea();
       Circle obj1=new Circle();
        
       
        obj1.CalculateArea();
}
}
