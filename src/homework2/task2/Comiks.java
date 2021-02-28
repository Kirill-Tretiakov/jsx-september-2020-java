package homework2.task2;

public class Comiks extends  Book {
    private String levelOfLaughter;

    public Comiks(String type, int quality, int pageCount, int yearOfIssue, String author, String levelOfLaughter) {
        super(type, quality, pageCount, yearOfIssue, author);
        this.levelOfLaughter = levelOfLaughter;
    }

    public String getLevelOfLaughter() {
        return levelOfLaughter;
    }

    public void setLevelOfLaughter(String levelOfLaughter) {
        this.levelOfLaughter = levelOfLaughter;
    }

    @Override
    public String toString() {
        return "Comiks{" +
                "levelOfLaughter='" + levelOfLaughter + '\'' +
                "} " + super.toString();
    }
}
