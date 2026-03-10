package btth;

public class Gold extends Tier{
    private String name;


    public Gold(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
