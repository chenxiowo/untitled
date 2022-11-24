package oopDay04;

public class Cricle {
    private double r;

    public Cricle() {
    }

    public Cricle(double r) {
        this.r = r;
    }

    public void mianji(){
        System.out.println("圆的面积"+Math.PI*(r*r));
    }
    public void zhouchang(){
        System.out.println("圆的周长"+2*Math.PI*r);
    }
}
