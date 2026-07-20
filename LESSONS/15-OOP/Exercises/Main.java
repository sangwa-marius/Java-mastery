public class Main {
    public static void main(String[] args){

        LibraryBook.displayTotalBooks();

        LibraryBook book1 = new LibraryBook("The man of people","Sangwa Marius");
        LibraryBook book2 = new LibraryBook("I will find you","Rocky");
        book1.borrowBook();
        book1.displayInfo();
        book2.displayInfo();
        LibraryBook.displayTotalBooks();
    }
}
