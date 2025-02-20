class Book{
    String title;
    double price;
    Book(){
        title="Java Programming";
        price=100.0;
    }
}
    public class Books{
        public static void main(String args[]){
            Book obj=new Book();
            System.out.println("Book Title:"+obj.title);
            System.out.println("Book Price:"+obj.price);
        }
    }
