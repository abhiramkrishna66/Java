class Car{
    String brand;
    Car(){
        brand="Unknown";
    }
    void SetBrand(){
        brand="Benz";
    }
}
public class Constructor{
    public static void main(String args[]){
        Car obj=new Car();
        obj.SetBrand();
        System.out.println("Car Brand:"+obj.brand);
    }
}
