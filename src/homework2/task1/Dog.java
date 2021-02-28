package homework2.task1;

public class Dog  extends  HomeAnimals{
    private boolean owner;

    public Dog(String name, int age, String poroda, String klikuha, boolean owner) {
        super(name, age, poroda, klikuha);
        this.owner = owner;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "owner=" + owner +
                "} " + super.toString();
    }
}
