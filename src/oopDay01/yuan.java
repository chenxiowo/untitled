package oopDay01;

public class yuan {
    double r;
    public yuan(){
    }
    public yuan(double _r){
        r=_r;
    }
    public double zhouchang(){
        return 2*Math.PI*r;
    }
    public double mianji(){
        return Math.PI*r*r;
    }
}
