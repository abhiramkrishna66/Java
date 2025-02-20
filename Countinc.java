class Counter{
    static int cnt=0;
    Counter(){
        
        cnt++;
}
}
public class Countinc{
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            Counter obj=new Counter();
            
            System.out.println("Object created:"+obj.cnt);
            
        }
              
    
    }
}
