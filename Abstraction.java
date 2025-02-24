import java.util.Scanner;
abstract class Circle{
 static double area,circumference,num;
 static void get(){
     Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
 }
static void calc_area(){
   
     area=3.14*num*num;
     System.out.println("AREA="+area);
 }
static void calc_circumference(){
     circumference=2*3.14*num;
     System.out.print("circumference="+circumference);
 }
}
 public class Abstraction{
     public static void main(String[]args){
         Circle.get();
         Circle.calc_area();
         Circle.calc_circumference();
     }
 }
