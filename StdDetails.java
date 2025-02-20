import java.util.Scanner;
class Student{
   void get(String n,int r){
       System.out.println("name:"+n);
       System.out.println("reg:"+r);
   }}
   public class StdDetails{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the Student's Name:");
   String name=sc.nextLine();
   System.out.print("Enter the Register Number:");
   int reg=sc.nextInt();
       Student obj=new Student();
       obj.get(name,reg);
   }
}
