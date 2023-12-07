public class ReferenceBook extends Book {
    private boolean referenceSection;

    public ReferenceBook(String id, String name, String author, boolean referenceSection) {
        super(id, name, author);
        this.referenceSection = referenceSection;
    }

    public boolean isReferenceSection() {
        return referenceSection;
    }

    public void setReferenceSection(boolean referenceSection) {
        this.referenceSection = referenceSection;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Reference section is : " + this.referenceSection);
    }
}
