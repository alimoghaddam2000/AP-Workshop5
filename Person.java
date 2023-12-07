import java.util.ArrayList;

public class Person {
    protected String name, contactInfo;
    protected ArrayList<Book> borrowedBook;

    public Person(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowedBook = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void displayInfo() {
        System.out.println("Name of Person is " + this.name);
        System.out.println("Contact info of Person is " + this.contactInfo);
    }

    public boolean borrowBook(Libraray libraray, Book book) {
        boolean success = libraray.removeBook(book);
        if (success) {
            this.borrowedBook.add(book);
            System.out.println("Detail of Person and Book that borrowed :");
            book.displayInfo();
            this.displayInfo();
        } else {
            System.out.println("Book is not available!!");
        }
        return success;
    }

    public boolean returnBook(Libraray libraray, Book book) {
        if (!this.borrowedBook.remove(book)) {
            System.out.println("Book has not been borrowed!!");
            return false;
        }
        libraray.addBook(book);
        System.out.println("Book returned!!");
        return true;
    }

    public boolean buyBook(Libraray libraray, Book book) {
        boolean success = libraray.removeBook(book);
        if (success) {
            System.out.println("Detail of Person and Book that bought :");
            book.displayInfo();
            this.displayInfo();
        } else {
            System.out.println("Book is not available!!");
        }
        return success;
    }
}
