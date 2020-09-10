package homeWorks.hw5.number4;

public class Konstryktors {
    int a;
    int b;
    int c;
    int d;

    public Konstryktors(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Konstryktors(int a, int b, int c) {
        this(a,b);
        this.c = c;
    }

    public Konstryktors(int a, int b, int c, int d) {
        this(a,b,c);
        this.d = d;
    }
}
