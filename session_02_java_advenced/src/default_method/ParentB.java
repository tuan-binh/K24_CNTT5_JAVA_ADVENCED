package default_method;

public interface ParentB {
    default void skill() {
        System.out.println("Kỹ năng boxing");
    }
}
