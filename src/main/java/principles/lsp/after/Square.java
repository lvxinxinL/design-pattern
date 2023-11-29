package principles.lsp.after;

/**
 * 正方形
 * @author Ghost
 * @version 1.0
 */
public class Square implements Quadrilateral{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getWidth() {
        return side;
    }

    public double getLength() {
        return side;
    }
}
