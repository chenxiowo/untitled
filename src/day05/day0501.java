package day05;

public class day0501 {
    public static void main(String[] args) {
//        Java的值传递
//        引用类型在值传递是传递的是地址，而基本数据类型传递的是值

//        字符串（String）
//        引用类型
//        创建字符串的方式：2种

//        方式一：字面量赋值
        String str1="hello world";
        System.out.println(str1);

//        方式二：调用String类中的构造方法
        String str2=new String("hello world");
        System.out.println(str2);


        String str3="气球";
        String str4="气球";
        System.out.println(str3==str4);//true

        String str5=new String("大门");
        String str6=new String("大门");
        System.out.println(str5==str6);//false

//        结论：
//        1.在比较引用类型时，==比较的是二者的地址是否相同
//        2.若采用字面量赋值的方式去创建字符串，值相同的情况下，只创建了一个对象。
//        地址是相同的（节省内存）
//        3.若采用构造方法的方式去创建字符串，即使是值相同的情况，也会创建多个对象
//        地址不同

//        比较引用类型的值，使用equals()的方法进行比较
        System.out.println(str3.equals(str4));//true

        System.out.println(str5.equals(str6));

//        总结：1.在比较引用类型时，==比较的是地址，equals()比较的是值
//              2.在比较基本数据类型时，==比较值

    }
}
