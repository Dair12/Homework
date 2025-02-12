public class Book {
    int year;
    String title;
    String author;

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
    public Book(String title){
        this.title=title;
    }
    String getInfo(){
        return title+" "+author+" "+year;
    }
    void grtDetal(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nYear: "+year);
    }
}
class PrintedBook extends Book{
    int pages;
    String publisher;
    double price;

    public PrintedBook(String title, int year, String author, int pages, String publisher) {
        super(title, year, author);
        this.pages = pages;
        this.publisher = publisher;
        this.price=pages*5;
    }
    public PrintedBook(String title){
        super(title);
    }
    @Override
    String getInfo(){
        return super.getInfo()+" "+pages+" "+publisher;
    }

    @Override
    void grtDetal() {
        super.grtDetal();
        System.out.println("Number pages: "+pages+"\nPublisher: "+publisher);
    }
    void bookType(){
        System.out.println("This is a Printed Book");
    }
    void printing(){
        System.out.println("Printing the book");
    }
}

class EBook extends Book{
    double size;
    String format;
    double price;

    public EBook(String title, int year, String author, double size, String format) {
        super(title, year, author);
        this.size = size;
        this.format = format;
        this.price=size*500;
    }
    public EBook(String title){
        super(title);
    }
    @Override
    String getInfo(){
        return super.getInfo()+" "+size+" "+format;
    }
    @Override
    void grtDetal() {
        super.grtDetal();
        System.out.println("Size: "+size+"\nFormat: "+format);
    }
    void bookType(){
        System.out.println("This is an EBook");
    }
}

class Main{
    public static void main(String[] args){
        EBook ebook=new EBook("It",2024,"Dair",10.5,"PDF");
        PrintedBook pbook=new PrintedBook("WHo?",1980,"Dair",105,"I");
        System.out.println("EBOOK___________________________________________");
        System.out.println(ebook.getInfo());
        ebook.grtDetal();
        ebook.bookType();
        System.out.println("PBOOK___________________________________________");
        System.out.println(pbook.getInfo());
        pbook.grtDetal();
        pbook.bookType();
    }
}