package day05;

import java.util.Arrays;

public class day0502 {
    public static void main(String[] args) {

//        字符串有下标（由0开始）
//              听   我   说   谢   谢   你
//              0    1    2    3    4   5
        String str1="听我说谢谢你";

        String  str2="TOM";
        str2 += "JACK";
        System.out.println(str2);

//        String的常用方法
//        1.获取字符串的长度   .length()  返回值类型：int
        System.out.println(str1.length());

//        2.根据下标找到对应位置的字符  .charAt()
//        形参的类型：int     返回值类型(char)
        System.out.println(str1.charAt(0));

//        3.根据传入的字符，获得其首次出现的下标，若该字符不存在于字符串中
//        则返回-1；   返回值类型：int
        System.out.println(str1.indexOf("谢"));
//        从指定位置开始，根据传入的字符，获得其首次出现的下标，若该字符不存在于字符串中
        System.out.println("str1.indexOf"+str1.indexOf("我", 2));

//        4.转大写  .toUpperCase
//        返回值类型：String
        String str3="    Hello World   ";
        System.out.println(str3.toUpperCase());

//        5.转小写 .toLowerCase  返回值类型：String
        System.out.println(str3.toLowerCase());

//        6.拼接字符串   .concat()  返回值类型：String
        System.out.println(str1.concat(str3));

//        7.比较字符串的值是否相同   .equals()   返回值类型：boolean
        System.out.println(str1.equals(str3));

//        8.去除首尾空格    .trim  返回值类型：String
        System.out.println(str3.trim());

//        9.截取字符串   .substring()
//        返回值类型：String
//        单参 ：从起始下标一直截取到字符串的最后
        System.out.println(str1.substring(3));
//        双参 :从起始下标截取至下标结束（结束下标的字符不会被截取）
        System.out.println(str1.substring(3,5));

//        10.startsWith(String prefix)：测试此字符串是否以指定的前缀开始
//        startsWith(String prefix ，int toffset):
//        测试此字符串从指定位置开始是否以指定的前缀开始
        String str5="听我说谢谢你";
        System.out.println(str5.startsWith("听我"));
        System.out.println(str5.startsWith("说",2));
//        像判断str5中第5个位置是否以“你”为前缀开始的，该如何书写？
        System.out.println(str5.startsWith("你",4));

//        11.endsWith(String prefix) :测试次字符串是否以指定后缀结束
        System.out.println(str5.endsWith("你"));

//        12.boolean equals(Object anObject) :比较两个字符串内容是否相等
//        boolean equalsIgnoreCase(Object anObject):不区分大小写比较两个字符串内容是否相等
        String str6=new String("aa张三");
        String str7=new String("Aa张三");
//        System.out.println("str6==str7:"+str6==str7);
        System.out.println(str6.equals(str7));
        System.out.println(str6.equalsIgnoreCase(str7));

//        13.int lastIndexOf(String str):返回指定字符串在此字符串中最后一次出现的位置
//        int lastIndexOf(String str，int fromIndex):从指定位置开始,返回指定字符串在此字符串中最后一次出现的位置

//        14. int compareTo(String anotherString):两个字符串比较
        String s1="abcdefg";
        String s2="abc";
//        a和a比较，b和b比较，c和c比较，s2结束，s1比s2多的长度
        System.out.println(s1.compareTo(s2));
        String s3="abd";
//        a和a比较，b和b比较，c和d比较，c的ASCII码是99，d的ASCII码100，返回99-100的值，后面不比较
        System.out.println(s1.compareTo(s3));
//        汉字比较的是unicode码
        String s4="俩";   //unicode     \u4fe6   ->    20457
        String s5="两";    //            \u4e24  ->    20004
        System.out.println(s4.compareTo(s5));

//        15.String[] split(String regex):根据指定字符对字符串拆分

        String s6="@aa@大家好@123456";
        String[] split = s6.split("@");
        System.out.println(Arrays.toString(split));

//         16. String replace(String old,String new ):把字符串中的子串全部替换为新字符串
        System.out.println(s6.replace("@", "SS"));

//        17.String replaceAll(String regex,String replacement):把字符串中
//        所有符合正则表达式的字符替换成新字符。
        String s7="aa100hello 200大家好20 AA1000";
        System.out.println(s7.replaceAll("\\d+", "CCC"));
        System.out.println(s7.replaceFirst("100", "C"));


    }
}
