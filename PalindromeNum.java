import java.util.Scanner;

class NextPalindrome{
    boolean palindrome(int n){
        int rev=0;
        int numb=n;
        int rem=0;
        if(n<0){
            return false;
        }
        while(numb!=0){
            rem=numb%10;
            rev=rev*10+rem;
            numb=numb/10;
            
        }
        return n==rev;
        
        }
        int nextPalindrome(int n){
            while(true){
                n++;
            if(palindrome(n)){
            return n;
        }
}
        }
}
    

public class PalindromeNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of inputs:");
        int input=sc.nextInt();
        int arr[]=new int[input];
        for(int i=0;i<input;i++){
        System.out.print("Enter the numbers:"+(i+1)+" :");
        arr[i]=sc.nextInt();
        }
        NextPalindrome obj=new NextPalindrome();
        for(int i=0;i<input;i++){
            System.out.println(obj.nextPalindrome(arr[i]));
        }
    }
}
  
