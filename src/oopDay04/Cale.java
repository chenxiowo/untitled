package oopDay04;

public class Cale {
    double a;
    double b;

    public Cale() {
    }

    public Cale(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double sum(){
        return a+b;
    }
    public double sub(){
        return a-b;
    }
    public double mul(){
        return a*b;
    }
    public double div(){
        if (b!=0){
            return a/b;
        }else {
            System.out.println("不合法");
            return 0.0;
        }
    }
}
