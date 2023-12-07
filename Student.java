public class Student extends Person {
    private String StudentId;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public Student(String name, String contactInfo, String StudentId) {
        super(name, contactInfo);
        this.StudentId = StudentId;
    }

    @Override
    public boolean borrowBook(Libraray libraray, Book book) {
        boolean success = libraray.removeBook(book);
        if (success) {
            this.borrowedBook.add(book);
            System.out.println("Detail of Student and Book that Student borrowed :");
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
        System.out.println("Student returned the book!!");
        return true;
    }

    @Override
    public boolean buyBook(Libraray libraray, Book book) {
        if (book instanceof ReferenceBook) {
            System.out.println("Students cannot buy Reference book!!");
            return false;
        }
        boolean success = libraray.removeBook(book);
        if (success) {
            System.out.println("Detail of Student and Book that bought :");
            book.displayInfo();
            this.displayInfo();
        } else {
            System.out.println("Book is not available!!");
        }
        return success;
    }

}
