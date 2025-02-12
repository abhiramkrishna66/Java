import java.util.Scanner;
public class PrimeorNot {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("This is not a prime number");
            return; 
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;  
            }
        }
        if (count == 0) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
