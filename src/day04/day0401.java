package day04;

public class day0401 {
    public static void main(String[] args) {
//        方法的重载：在同一类中，方法名相同但形参不同
//        （形参数据类型不相同 或 形参个数不同， 与方法的返回值无关）

//        重载的优点：
//        我们可以将经常使用的逻辑封装在方法的内部，通过改变实际传入方法的参数，
//        来获得不同的结果
//        提高代码的复用率，提高开发的效率
        dogInfo(1,'男');
    }

    public static void  dogInfo(){
        System.out.println("没有获得小狗的任何信息");
    }

    public static void dogInfo(int age){
        System.out.println("小狗的年龄"+age+"岁");
    }
    public static void  dogInfo(char sex){
        System.out.println("小狗的性别是："+sex);
    }

    public static void dogInfo(int age,char sex){
        System.out.println("小狗的年龄"+age+"岁");
        System.out.println("小狗的性别是："+sex);
    }

}
