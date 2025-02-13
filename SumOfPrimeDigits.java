public class SumOfPrimeDigits {
    public static void main(String[] args) {
        int number = 123456;
        int sum = 0;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i)); 
            if (isPrime(digit)) {
              
    }  sum += digit; 
            }
        }
        System.out.println("Sum of prime digits in " + number + " is: " + sum);
    }

    public static boolean isPrime(int digit) {
        if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
            return true; 
        }
        return false; 
}
