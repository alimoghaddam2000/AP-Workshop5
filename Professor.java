public class Professor extends Person {
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Professor(String name, String contactInfo, String employeeId) {
        super(name, contactInfo);
        this.employeeId = employeeId;
    }

    @Override
    public boolean borrowBook(Libraray libraray, Book book) {
        boolean success = libraray.removeBook(book);
        if (success) {
            this.borrowedBook.add(book);
            System.out.println("Detail of Proffesor and Book that Proffesor borrowed :");
            book.displayInfo();
            this.displayInfo();
        } else {
            System.out.println("Book is not available!!");
        }
        return success;
    }

    @Override
    public boolean returnBook(Libraray libraray, Book book) {
        if (!this.borrowedBook.remove(book)) {
            System.out.println("Book has not been borrowed!!");
            return false;
        }
        libraray.addBook(book);
        System.out.println("Proffesor returned the book!!");
        return true;
    }

    @Override
    public boolean buyBook(Libraray libraray, Book book) {
        if (book instanceof EBook) {
            System.out.println("Proffesor cannot buy Ebook!!");
            return false;
        }
        boolean success = libraray.removeBook(book);
        if (success) {
            System.out.println("Detail of Professor and Book that bought :");
            book.displayInfo();
            this.displayInfo();
        } else {
            System.out.println("Book is not available!!");
        }
        return success;
    }

}