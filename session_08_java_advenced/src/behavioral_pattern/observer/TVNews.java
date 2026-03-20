package behavioral_pattern.observer;

public class TVNews implements Observer {
    @Override
    public void update(String news) {
        System.out.println("[ Television ] " + news);
    }
}
