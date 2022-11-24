package oopDay01;

public class oopDay0101 {
    public static void main(String[] args) {
//        知识点1：什么是面向对象？
//        面向对象是一种编程思想，所有的操作都是针对对象的属性和方法进行操作
//        知识点2：面向对象的特点：封装，继承，多态，抽象

//        知识点3：什么是类？什么是对象？
//        类是放映现实世界一类事物抽象的概念 例如：学生类
//        对象是类的具体事例 例如：学生张三，李四
//        类和对象的关系：类是对象的模板，对象是类的具体实例

//        知识点4；Java怎样描述一个类，通过关键字class定义一个类
//        属性   -> 全局变量
//        行为   -> 方法

//        知识点5：创建对象   类类型  引用变量名  =  new  类的构造方法();
//        注意：以类为模板创建对象，每个对象里都有一份类的属性，并且自己使用自己的属性

//        创建第一个学生对象

        Student ak47 =new Student();
        ak47.id="250";
        ak47.name="AK47";
        ak47.sex='雄';
        ak47.department="全自动步枪";
        ak47.age=2;
        ak47.study();
        ak47.sleep();

//        创建第二个学生对象
        Student m4a4=new Student();
        m4a4.id="m995";
        m4a4.age=6;
        m4a4.show();

        Student an94=new Student();
        an94.id="200";
        an94.name="AN94";
        an94.sex='雄';
        an94.department="全自动步枪";
        an94.age=8;
        an94.show();
//        知识点6：构造器/构造方法
//        6.1构造方法的语句特点
//        构造方法的名字必须和类名相同
//        没有返回值也不能加关键字void

//        6.2 构造方法的作用
//        创建对象： 初期化成员变量

//        6.3构造方法的使用
//        只有在创建对象的时，通过关键字new才能使用

//        6.4构造方法的分类
//        默认无参构造方法：
//        自定义有参构造方法

//        6.5构造方法的注意事项
//        a.创建类的时候java会提供一个默认无参的构造方法
//        b.一旦创建自定义有参构造方法后，java将不会提供默认无参构造方法
//        c.为了避免不必要的麻烦，如果要定义有参构造方法的话，需要默认无参构造方法
//        显示的写出来

        Student stu1=new Student("1001","da");
        stu1.show();
        Student stu2=new Student("1200","lala",'男',
                "计算机",16);
            stu2.show();
            Cube aa=new Cube(8);
            aa.show();
        System.out.println("这个正方行的面积是"+aa.area());
        System.out.println("这个正方形的周长是"+aa.zhouchang());
        yuan bb=new yuan(8);
        System.out.println("这个圆的周长"+bb.zhouchang());
        System.out.println("这个圆的面积"+bb.mianji());

        int[] p1=new int[]{1,2};
        Member[]mems=new Member[3];
        Member m1=new Member("1001","张1"
                ,"PG",3000);
        mems[0]=m1;
        mems[1]=new Member("2001","张3",'女',
                "PG",4000);
        for(Member mem:mems){
            if(mem==null){
                break;
            }
            mem.show();
        }

        Company com1=new Company("大大大","neme");
        com1.addMember(new Member("1001","name",'男'
                ,"PG",5));
        com1.addMember(new Member("1002","neme",'女'
                ,"PG",5));
        com1.showCompany();


//        知识点7：引用和对象关系
//        对象：java通过关键字new 调用类的构造器创建对象的队里。
//        引用：创建对象后，把对象的地址赋值给比变量，那么这个变量就叫做引用
        Student stu0 =null;
        Student stu= new Student("1001","张三");

//        一个对象可以被多个引用操作
        Student s1=new Student("3003","张2");
        Student s2=s1;
        s1.name="张2修改";
        s2.department="日语";
        s1.show();
        s2.show();


    }
}
