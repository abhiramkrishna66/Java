import java.util.Scanner;

class Add {
    private int a,b,c;

    private void getinput() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); 
        b = sc.nextInt(); 
    }
    public void sum() {
        getinput();
        c = a+b; 
        System.out.println("Sum: "+c);
    }
}

public class PriAccess{
    public static void main(String[] args) {
        Add obj = new Add();
        obj.sum();
    }
}
