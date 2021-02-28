package homework2.task2;

public class Book extends Papirus {
    private  int pageCount;
    private  int yearOfIssue;
    private  String author;

    public Book(String type, int quality, int pageCount, int yearOfIssue, String author) {
        super(type, quality);
        this.pageCount = pageCount;
        this.yearOfIssue = yearOfIssue;
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pageCount=" + pageCount +
                ", yearOfIssue=" + yearOfIssue +
                ", author='" + author + '\'' +
                "} " + super.toString();
    }
}
