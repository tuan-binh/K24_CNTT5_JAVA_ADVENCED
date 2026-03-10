package btth;

public class Silver extends Tier{
    private String name;

    public Silver(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
