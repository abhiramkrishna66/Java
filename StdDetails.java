import java.util.Scanner;
class Student {
	void get(String arr[],int arr1[]) {
	    for(int i=0;i<5;i++){
		System.out.println("name:"+arr[i]);
		System.out.println("reg:"+arr1[i]);
	}
}
}
public class StdDetails{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		int arr1[]=new int[5]; 
		for (int i=0;i<5;i++){
		System.out.print("Enter the Student's Name:");
		arr[i]=sc.nextLine();
		System.out.print("Enter the Register Number:");
		arr1[i]=sc.nextInt();
		sc.nextLine();
		}
		
		Student obj=new Student();
		obj.get(arr,arr1);
	}
}
