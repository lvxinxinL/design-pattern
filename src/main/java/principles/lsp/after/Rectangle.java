package principles.lsp.after;

/**
 * 长方形
 * @author Ghost
 * @version 1.0
 */
public class Rectangle implements Quadrilateral{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
