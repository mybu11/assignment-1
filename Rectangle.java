public class Rectangle {
    private double width;
    private double height;
    private int id;
    private static int idGen = 0;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.id = idGen++;
    }
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.id = idGen++;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width < 0.0) {
            throw new IllegalArgumentException("width must be >= 0");
        }
        else {
            this.width = width;
        }
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
        else{
            throw new IllegalArgumentException("Height must be > 0");
        }
    }
    public int getId() {
        return id;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return (width + height) * 2;
    }
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + ", id=" + id + '}';
    }
    

}

