public class EBook extends Book {

    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public EBook(String id, String name, String author, String format) {
        super(id, name, author);
        this.format = format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format of book: " + this.format);
    }
}
