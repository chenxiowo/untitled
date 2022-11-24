package day02;

public class day0203 {
    public static void main(String[] args) {
//        二维数组：二维数组中存放的元素是一个又一个的一维数组
//        引用类型
//        下标的概念与一维数组一致
//        获取数组的长度与一维数组一致  .length
//        添加、修改和获取元素的方式与一维数组一致

//        创建二维数组
//        方式一：静态创建方式：
        int[][] numArray = new int[][]{{1,2,3},{7,8,9},{1,2,6,7}};

//        方式二：动态创建方式
//                                 [二维数组长度][一维数组的长度(可不设置)];
        double[][] doubleArray = new double[4][];
        doubleArray[0]  = new double[]{1.1,1.2};
        doubleArray[1]  = new double[]{1.3,1.4};
        doubleArray[2]  = new double[]{3.3,2.2};
        doubleArray[3]  = new double[]{3.1,4.2,4.4};

//        请修改doubleArray中的数据，将 3.3，2.2替换为7.7,7.8

        for(int i=0 ; i<doubleArray.length;i++){
            for (int j =0;j<doubleArray[i].length;j++){
                if(doubleArray[i][j]==3.3){
                    doubleArray[i][j]=7.7;
                }
                if (doubleArray[i][j]==2.2){
                    doubleArray[i][j]=7.8;
                }
            }
        }

//        遍历doubleArray,在控制台输出二维数组中的每一个元素2
//        i：二维数组下标
//        for(int i=0 ; i<doubleArray.length;i++){
//        j：一维数组的下标
//            for (int j =0;j<doubleArray[i].length;j++) {
//                System.out.println(doubleArray[i][j]);
//            }
//        }

//        使用新型for循环
//        遍历doubleArray二维数组
//        (数据类型 数组中的元素 ： 数组)
        for (double[] i:doubleArray){
            for (double j:i){
                System.out.println(j);
            }
        }


    }
}
