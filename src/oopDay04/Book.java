package oopDay04;

public class Book {

    private String name;
    private double max;

    public Book() {
    }

    public Book(String name, double max) {
        this.name = name;
        this.max = max;
    }
////    老师方法
//    public void updatePrice(){
//        if (max>150){
//            max=150;
//        }else if (max>100&&max<=150){
//            max=100;
//        }
//    }
    public void info(){
        System.out.println("书名是："+name+"价格是"+max);
    }

//        自己方法
    public void updatePrice(){
        if (max>100&&max<=150){
            max=100;
        }else if (max>150){
            max=150;
        }
    }
}
