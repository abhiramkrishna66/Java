import java.util.*;

public class stars {

 public static void main(String args[])    {
        int i, j,n=7;
        int num = 1;
        for (i = 2; i <= n; i++) {
            for (j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (i = n-1; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i- 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
        }
