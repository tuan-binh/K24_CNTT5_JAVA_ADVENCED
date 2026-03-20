package behavioral_pattern.observer;

public class Newspaper implements Observer {
    @Override
    public void update(String news) {
        System.out.println("[ Newspaper ] " + news);
    }
}
