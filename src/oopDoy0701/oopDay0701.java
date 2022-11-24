package oopDoy0701;

public class oopDay0701 {
    public static void main(String[] args) {
//        知识点1：接口
//        1.1接口的定义
//           java通过关键字interface定义接口，接口没有构造方法，不能创建对象
//        public interface 接口名 [extends 父类接口列表] {.......}
        SecurityDoor door=new SecurityDoor();
        door.alarm();
        door.close();
        door.open();
    }
}
