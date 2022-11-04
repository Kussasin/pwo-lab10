
package observer;

import observer.Publisher.Subscriber;

/**
 *
 * @author Bohdan Basistyi
 */
public class SumFinder implements Subscriber {

    Integer sum = null;

    public void action(int x) {
        sum = sum == null ? x : sum + x;
    }

    public int getSum() {
        return sum;
    }
}
