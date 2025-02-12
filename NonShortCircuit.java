public class NonShortCircuit
{
	public static void main(String[] args) {
	    int a=20;
	    int b=10;
	    int c=14;

     System.out.println("A is the greatest"+(a>b && a>c));
     System.out.println("B is Greatest"+(b>a && b>c));
     System.out.println("C is greatest"+(c>a && c>b));
}
}
