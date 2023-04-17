package behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
    private List<ObserverInterface> observers = new ArrayList<>();

    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            ObserverInterface obs = (ObserverInterface) it.next();
            obs.update(this);
        }
    }
}
