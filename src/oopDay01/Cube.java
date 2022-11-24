package oopDay01;

public class Cube {
    double length;//边长

//    无参构造
    public Cube(){

    }

//    有参构造
    public Cube(double _length){
        length=_length;
    }
    public void show(){
        System.out.println("这个正方形的边长是"+length);
    }
    public double area(){
        return length*length;
    }
    public double zhouchang(){
        return length*4;
    }

}
