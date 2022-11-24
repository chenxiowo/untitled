package oopDay04;

public class MyDate {
    private int n;
    private int y;
    private int r;

    public MyDate() {
    }

    public MyDate(int n, int y, int r) {
        this.n = n;
        this.y = y;
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return n+"年"+y+"月"+r+"日";
    }
}
