import java.util.Scanner;
class Add{
public int a,b,sum;
public void Display(){
    sum=a+b;
    System.out.print("Sum:"+sum);
}}
public class pubclass{
    public static void main(String[] args){
        Add obj=new Add();
        Scanner sc=new Scanner(System.in);
        obj.a=sc.nextInt();
        obj.b=sc.nextInt();
        obj.Display();
    }
}

