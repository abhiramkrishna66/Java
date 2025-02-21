class Patterns{
    static int n=5;
    static class patterns{
    static void display(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("# ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
}
public class StaticPatterns{
    public static void main(String[] args){
       Patterns.patterns.display();
    }
}
