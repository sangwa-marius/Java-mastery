public class LibraryBook {

    private String title;
    private String author;
    private boolean available = true;

    private static int totalBooks;

    public LibraryBook(String title, String author){
        this.title = title;
        this.author = author;
        totalBooks++;

    }

    public void borrowBook(){
        available = false;
    }
    public void returnBook(){
        available = true;
    }

    public void displayInfo(){
        System.out.println("\nTitle   : "+title);
        System.out.println("Author  : "+author);
        System.out.println("Status  : "+(available?"Available":"Borrowed"));
    }

    public static void displayTotalBooks(){
        System.out.println("Total books: "+totalBooks);
    }
}