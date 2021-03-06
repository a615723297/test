import java.util.Objects;

public class test2 {

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public test2() {
    }

    public test2(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof test)) return false;
        test2 test = (test2) o;
        return a == test.a &&
                b == test.b &&
                c == test.c &&
                d == test.d &&
                e == test.e;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c, d, e);
    }

    @Override
    public String toString() {
        return "test2{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                '}';
    }
}
