public class Main {
    public static void main(String[] args) {
        Libraray library = new Libraray();
        Book book1 = library.addBookToLibrary("1", "Java Programming", "Ehsan Shobeiri");
        library.addBookToLibrary("2", "Shahname", "Ferdowsi");
        library.addBookToLibrary("3", "Deep learning", "Andrew NG");
        Book notBook = new Book("fakeBook", "NoBook", "Null");
        EBook ebook1 = library.addEBookToLibrary("4", "Learn Riffs", "James Hetfield", "PDF");
        EBook ebook2 = library.addEBookToLibrary("5", "Rock with Moore", "Gary Moore", "EPUB");
        library.addEBookToLibrary("6", "The Stranger", "Alber Camus",
                "MOBI");
        ReferenceBook referenceBook1 = library.addReferenceBookToLibrary("7", "Algorithm Design", "Bob Johnson", true);
        ReferenceBook referenceBook2 = library.addReferenceBookToLibrary("8",
                "Database Management", "Karen Brown", false);
        library.addReferenceBookToLibrary("9",
                "Network Security", "Sam Davis", true);
        Student student1 = library.addStudent("Alice", "alice123@gmail.com", "S001");
        Professor professor1 = library.addProfessor("Dr. Smith", "smith@gmail.com",
                "P001");
        System.out.println("Books in the library:");
        library.displayAllBooks();
        System.out.println("Total Library Value: $" +
                library.calculateTotalLibraryValue());
        System.out.println("-------------------");
        student1.borrowBook(library, book1);
        student1.borrowBook(library, notBook);
        professor1.borrowBook(library, referenceBook1);
        professor1.borrowBook(library, notBook);
        student1.buyBook(library, ebook1);
        student1.buyBook(library, referenceBook2);
        professor1.buyBook(library, ebook2);
        student1.borrowBook(library, referenceBook1);
        professor1.buyBook(library, referenceBook1);
        System.out.println("Updated books in the library:");
        library.displayAllBooks();
        System.out.println("Total Library Value: $" +
                library.calculateTotalLibraryValue());
        System.out.println("-------------------");
        student1.returnBook(library, book1);
        professor1.returnBook(library, referenceBook1);
        System.out.println("Final books in the library:");
        library.displayAllBooks();
        System.out.println("Total Library Value: $" +
                library.calculateTotalLibraryValue());
    }
}