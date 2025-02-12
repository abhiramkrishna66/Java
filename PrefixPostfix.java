public class PrefixPostfix{
    public static void main(String[] args){
        int x=10;
        //int v= --x + x++ + ++x + --x + x++;
        int z=x++ + ++x + ++x + x++ + ++x;
        
        System.out.println(z);
    }
}
