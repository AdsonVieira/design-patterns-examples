package behavioral.strategy;

import java.util.List;

public class ContactList {
    private List<String> list;
    private SortStrategy sortStrategy;

    public ContactList(SortStrategy sortStrategy, List<String> list) {
        this.list = list;
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        this.sortStrategy.sort();
    }
}
