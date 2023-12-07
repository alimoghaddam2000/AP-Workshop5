public class Book {
    protected String name, author, id;

    public Book(String id, String name, String author) {
        this.name = name;
        this.author = author;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("id of the book: " + this.id);
        System.out.println("Name of the book: " + this.name);
        System.out.println("author of the book: " + this.author);
    }
}
