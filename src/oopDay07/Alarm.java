package oopDay07;

public interface Alarm {
//    接口里的全局变量都是默认被public static final修饰的静态变量
    String ALARM = "呜呜~  呜呜~";

//    接口里的方法默认被public abstract修饰的抽象方法
    void alarm();
}
