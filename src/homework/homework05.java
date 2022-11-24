package homework;

import java.util.Arrays;

/*编写代码，截取字符串“班干部管班干部”，得到结果“部管班”。*/
public class homework05 {
    public static void main(String[] args) {
//        String one="班干部管班干部";
//        //班 干  部 管 班 干 部
//        //0  1   2  3  4  5  6
//        //方法一
//        System.out.print(one.charAt(2));
//        System.out.print(one.charAt(3));
//        System.out.println(one.charAt(4));
//        //方法二
//        System.out.println(one.substring(2,5));
//        /*  str1==str2      str1.equals(str2)
//        的结果分别是什么
//         */
//
//        String str1="hello world";
//        String str2=new String("hello world");
//        System.out.println(str1==str2);
//        System.out.println( str1.equals(str2));
        String s1="abcdefg";
        String s2="abc";
//        a和a比较，b和b比较，c和c比较，s2结束，s1比s2多的长度
        System.out.println(s1.compareTo(s2));
        String s3="abd";
//        a和a比较，b和b比较，c和d比较，c的ASCII码是99，d的ASCII码100，返回99-100的值，后面不比较
        System.out.println(s1.compareTo(s3));

    }
}
