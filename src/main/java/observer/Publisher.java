package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bohdan Basistyi
 */
public class Publisher {

    public interface Subscriber {

        void action(int x);
    }

    List<Subscriber> subscribers = new ArrayList<>();

    public void add(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(int x) {
        subscribers.forEach(subscriber -> subscriber.action(x));
    }

}
