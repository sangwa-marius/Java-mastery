public class Book {
    String bookTitle;
    String bookAuthor;
    double bookPrice;
    int pageCount;

    public Book(String title, String author, double price, int pages){
        bookAuthor = author;
        bookTitle = title;
        bookPrice = price;
        pageCount = pages;
    }

    public void displayInfo(){
        System.out.println("Book Title      : "+bookTitle);
        System.out.println("Book Author     : "+bookAuthor);
        System.out.println("Book Price      : "+bookPrice);
        System.out.println("Number of Pages : "+pageCount);
    }
}
