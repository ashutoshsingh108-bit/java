public class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Books are available by default when added
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Success: '" + title + "' has been issued.");
        } else {
            System.out.println("Error: '" + title + "' is already issued and cannot be issued again.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Success: '" + title + "' has been returned.");
        } else {
            System.out.println("Note: '" + title + "' was already available in the library.");
        }
    }

    public void displayBook() {
        String status = isAvailable ? "Available" : "Issued";
        System.out.println("Book ID: " + bookId + " | Title: " + title + " | Author: " + author + " | Status: " + status);
    }

    public static void main(String[] args) {
        Book myBook = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");

        myBook.displayBook();
        
        // Issue the book for the first time
        myBook.issueBook();
        
        // Try to issue it again (violates the constraint)
        myBook.issueBook();
        
        // Return the book
        myBook.returnBook();
        
        // Display final state
        myBook.displayBook();
    }
}