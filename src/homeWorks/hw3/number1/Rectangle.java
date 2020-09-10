package homeWorks.hw3.number1;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 10;
        this.width = 7;
    }

    public void area(){
        System.out.println("Площа прамокутника: "+ (length*width));
    }

    public void perimetr(){
        System.out.println("Периметр прямокутника: " + (2*(length+width)));
    }

}
