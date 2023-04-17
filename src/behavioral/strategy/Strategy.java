package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Strategy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        ContactList contactList = new ContactList(new QuickSortStrategy(), list);
        contactList.sort();

        contactList = new ContactList(new ShellSortStrategy(), list);
        contactList.sort();
    }
}
