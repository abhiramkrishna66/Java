class Book{
    String Author;
    String title;
    double price;
    Book(String Author,String title,double price){
       this.Author=Author;
       this.title=title;
       this.price=price;
}
void display(){
    System.out.println("Author:"+Author);
    System.out.println("title:"+title);
    System.out.println("price:"+price);
}
}
public class Parametrizedconst{
    public static void main(String[] args){
        Book obj=new Book("Arthur","SHO",1000);
        obj.display();
    }
}
