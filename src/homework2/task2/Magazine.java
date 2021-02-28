package homework2.task2;

public class Magazine extends  Book {
    private  String name;

    public Magazine(String type, int quality, int pageCount, int yearOfIssue, String author, String name) {
        super(type, quality, pageCount, yearOfIssue, author);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
