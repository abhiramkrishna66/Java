class CalculateArea{
    static class Calculate{
        static void Area(double r){
         double areaCircle=3.14*r*r;
            System.out.println("Area of a circle is:"+areaCircle);
        }
        static void Area(int l,int b){
         int areaRect=l*b;
        System.out.println("Area of the rectangle is:"+areaRect);
    }
        static void Area(int s){
         int areaSq=s*s;
        System.out.println("Area of the square is:"+areaSq);
        }
        
}
}
public class Overloading{
    public static void main(String[] args){
    CalculateArea.Calculate.Area(10);
    CalculateArea.Calculate.Area(10,5);
    CalculateArea.Calculate.Area(7.0);
    
}
}
