public class Greatest{
    public static void main(String[] args){
        int a=10,b=23,c=58;
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The Greatest number is:"+max);
    }
}
