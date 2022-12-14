package flyweight;

/**
 *
 * @author Bohdan Basistyi
 */
public class Particle {

    private final Context context;
    private final State state;

    public Particle(Context context, State state) {
        this.context = context;
        this.state = state;
    }

    public void setX(double x) {
        context.setX(x);
    }

    public void setY(double y) {
        context.setY(y);
    }

    public double getX() {
        return context.getX();
    }

    public double getY() {
        return context.getY();
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ") "
                + state.color + " " + state.texture;
    }

}
