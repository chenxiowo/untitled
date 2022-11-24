package day02;

public class day0201 {
    public static void main(String[] args) {
//        一维数组(Array) : 使用一个变量存储一组数据
//        引用类型

//        创建数组的方式 ：2种
//        方式一：静态创建
//        表达式： 数组类型[] 数组名 = new 数据类型[]{数组中的元素};
//        在创建数组时，必须知道该数组所能存储的数据类型。
//        数组中，元素与元素之间，使用英文逗号分隔。
        int[] chengxu1 = new int[]{1,2,20,43};
        double[] chengxu2 = new double[]{1.2,34.3,90.99};
//        System.out.println(chengxu1);
//        System.out.println(chengxu2);
////        方式二：动态创建
////        表达式： 数组类型[] 数组名 = new 数据类型[数组的长度(该数组最多存放多少个元素)]
////        必须设置数组长度
        char[] chengxu3 = new char[3];
////        数组的下标：下标由0开始，作用是确定数组中元素的位置
////        添加或修改数组中的元素 ： 数组名[下标] = 值
//        chengxu3[0] = 'A' ;
//        chengxu3[1] = 'B';
//        chengxu3[2] = 'C';
//        chengxu3[3] = 'D';
//        System.out.println(chengxu3);
////        在java中 ，引用类型的数据，在控制台输出，输出的是地址
//
////        获取一个数组的长度 ： length 属 性
        System.out.println(chengxu1.length);
        System.out.println(chengxu2.length);
        System.out.println(chengxu3.length);

////        数组中存放了四个人的年龄信息，计算出四个人的平均年龄
//        int[] ageAarray = new int[]{28,17,40,65};
//        double age =(double)(ageAarray[0] +ageAarray[1]+  ageAarray[2] +ageAarray[3])/ageAarray.length;
//        System.out.println(age);

//        小总结：
//        1.创建方式 2种： 动态、静态
//        2.下标的概念： 由0开始
//        3.获取数组的长度：  .length
//        4.使用下标向数组中添加或修改数据：   数组名[下标]=值
//        5.通过下标获取数组中指定位置的元素  ：数组名[下表]

//        计算出班级的平均分   ----利用循环搭配下标
//        利用掌握的循环搭配下标动态的获取数组中的每一个元素，叫数组的   遍历
//        int[]  scoreArray  = new int[]{2,3,4,5,6,123,321,312};
//        int sum = 0;
//        for(int i=0; i<scoreArray.length;i++){
//            sum  +=  scoreArray[i];
//        }
//        System.out.println((double) sum/scoreArray.length);
//
//        for (int i=1;i<=10;i++){
//            System.out.print(i+",");
//        }
//        System.out.println();
//        for (int i=1; i<=100;i+=2){
//            System.out.println(i);
//        }

//        int sum =0;
//        int geshu=0;
//        for (int i=1; i<=100;i+=2){
//            System.out.println(i);
//            sum+=i;
//            geshu++;
//        }
//        System.out.println(geshu);

//        for(int i=0;i<=100;i+=2){
//            System.out.println(i);
//            sum+=i;
//        }
//        System.out.println(sum);
    }
}
