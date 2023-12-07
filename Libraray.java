import java.util.ArrayList;

public class Libraray {
    ArrayList<Book> books;
    ArrayList<Person> people;
    private static final double EACH_BOOK_PRICE = 123.13;

    public Libraray() {
        this.books = new ArrayList<Book>();
        this.people = new ArrayList<Person>();
    }

    public Book addBookToLibrary(String name, String author, String id) {
        Book book = new Book(name, author, id);
        this.books.add(book);
        return book;
    }

    public EBook addEBookToLibrary(String name, String author, String id, String format) {
        EBook eBook = new EBook(name, author, id, format);
        this.books.add(eBook);
        return eBook;
    }

    public ReferenceBook addReferenceBookToLibrary(String name, String author, String id, boolean referenceSection) {
        ReferenceBook referenceBook = new ReferenceBook(name, author, id, referenceSection);
        this.books.add(referenceBook);
        return referenceBook;
    }

    public Student addStudent(String name, String contactInfo, String StudentId) {
        Student student = new Student(name, contactInfo, StudentId);
        this.people.add(student);
        return student;
    }

    public Professor addProfessor(String name, String contactInfo, String employeeId) {
        Professor professor = new Professor(name, contactInfo, employeeId);
        this.people.add(professor);
        return professor;
    }

    public boolean addBook(Book b) {
        return this.books.add(b);
    }

    public boolean removeBook(Book b) {
        return this.books.remove(b);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public double calculateTotalLibraryValue() {
        return books.size() * EACH_BOOK_PRICE;
    }
}
