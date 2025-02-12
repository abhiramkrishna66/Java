public class Reverse{
public static void main(String[] args){
    int num=59667;
    String numberstr=Integer.toString(num);
    for(int i=numberstr.length()-1;i>=0;i--){
        System.out.print(numberstr.charAt(i));
    }
    
    
}
}
    
