package oopDay06;

public class oopDay0601 {
    public static void main(String[] args) {
//            知识点1：关键词abstract（抽象）
//        abstract可以修饰方法和类
//        abstract修饰的类叫做抽象类，修饰的方法叫做抽象方法，
//        抽象方法只能声明，不能有方法体
//        抽象类不能实例化对象

//        注意：
//           a.抽象类不能实例化
//           b.抽象类是有构造方法，构造方法是给子类实例化对象来调用的
//           c.抽象类里除了抽象方法外，还可以有实现方法
//           d.抽象类里可以没有抽象方法，但是抽象方法所在的类一定要定义成抽象类


//        类中方法和抽象类中方法的区别
//            类中的方法的特点是：都是实现的方法！！！
//            抽象类中的方法：可以是抽象方法，也可以是实现方法。
//            包含抽象方法的类一定是抽象类，抽象类中不一定包含抽象方法
//            抽象类中构造方法，但是不能创建对象。作用：初始化子类



        
//        Animal a=new Animal() ;  抽象类下不能new对象。
        Cat c=new Cat();
        c.shot();

        SalaryCalculator month8=new SalaryCalculator();
        month8.addEmp(new ContractEmployee("合同工1",4000));
        month8.addEmp(new HourlyEmployee("小时工1",100,20));
        month8.addEmp(new ContractEmployee("合同工2",5000));
        month8.addEmp(new HourlyEmployee("小时工2",50));
        month8.addEmp(new ContractEmployee("小时工3",8000));
        System.out.println("8月份的总工资："+month8.salarySum());
    }
}
