package oopDay04;

public class test {
    public static void main(String[] args) {
//        声明一个员工类Employee。包含属性：编号、姓名呢、年龄、薪资
//        声明Test1测试类、并main方法中，创建一个员工对象，并为其属性赋值，在打印员工信息

//        声明一个日期类MyDate，包含属性：年、月、日：声明一个Test2测试类，并main方法中创建一个日期对象并打印出来

//        思考：声明一个工具类DateCommonsTools，包含五个方法
//        1.根据星期值，返回对应的英文单词 例：输入1返回Monday
//        2.输入月份值，返回对应的英文单词  例：January
//        3.判断是否是闰年
//        4.返回某年某月的总天数   例：输入2022 11 返回31天
//        5.获取某年的总天数
        System.out.println(DateCommonsTools.getWeekName(0));
        System.out.println(DateCommonsTools.getMonthName(0));
        System.out.println(DateCommonsTools.isLeapYear(2021));
    }
}