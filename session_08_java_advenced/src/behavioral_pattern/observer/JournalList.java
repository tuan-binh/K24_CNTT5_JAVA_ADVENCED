package behavioral_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class JournalList {
    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void publishNews(String news) {
        observerList.forEach(e -> {
            e.update(news);
        });
    }
}
