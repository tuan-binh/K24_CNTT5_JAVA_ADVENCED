package behavioral_pattern.observer;

public class Main {
    public static void main(String[] args) {
        JournalList journalList = new JournalList();
        journalList.addObserver(new TVNews());
        journalList.addObserver(new OnlineNews());
        journalList.addObserver(new Newspaper());
        journalList.publishNews("Vụ Iran vs Mỹ");
    }
}
