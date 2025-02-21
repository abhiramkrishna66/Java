class LeftAngledTriangle{
    public int n=5;
    public void printleft(){
        System.out.print("Left Angled Triangle:");
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
class RightAngledTriangle{
    public int n=5;
    public void printright(){
        System.out.println("Right Angled Triangle:");
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
public class Triangles{
    public static void main(String[] args){
        LeftAngledTriangle obj=new LeftAngledTriangle();
        obj.printleft();
        RightAngledTriangle obj1=new RightAngledTriangle();
        obj1.printright();
    }
}
