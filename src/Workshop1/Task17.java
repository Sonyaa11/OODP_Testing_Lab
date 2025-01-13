package Workshop1;

public class Task17 {
	
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(8, 12);

        System.out.println(rect1);
        System.out.println(rect2);
    }
}

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [Width: " + width + ", Height: " + height + "]";
    }
}
