package behavioral_pattern.observer;

public class OnlineNews implements Observer {
    @Override
    public void update(String news) {
        System.out.println("[ Online ] " + news);
    }
}
