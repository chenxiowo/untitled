package day02;

import java.util.Arrays;

public class day0205 {
    public static void main(String[] args) {
//        练习
//        数组内有如下元素 4, 2, 0 ,-1, -8 ,23 ,9
//        在控制台上输出该数组内的最大值、最小值、总和 、 平均值
//        方法一：
//        int[] numberArray=new int[]{4,2,0,-1,-8,23,9};
//        int sum=0;
//        int avg=0;
//        int max = numberArray[0];
//        int min = numberArray[0];
//
//        for(int i =0;i<numberArray.length;i++){
//            if (max < numberArray[i]){
//                max = numberArray[i];
//            }
//            if(min > numberArray[i]){
//                min=numberArray[i];
//            }
//            sum+=numberArray[i];
//        }
//        System.out.println("最大值是："+max);
//        System.out.println("最小值是："+min);
//        System.out.println("总和是："+sum);
//        System.out.println("平均值是："+sum/numberArray.length);

//        方法二：
//        int[] numberArray=new int[]{4,2,0,-1,-8,23,9};
//        Arrays.sort(numberArray);
//        System.out.println("最小值是："+numberArray[0]);
//        System.out.println("最大值是："+numberArray[numberArray.length-1]);
//        int sum=0;
//        for (int i :numberArray){
//            sum+=i;
//        }
//        System.out.println("总和是："+sum);
//        System.out.println("平均值是："+sum/numberArray.length);

//        2.在某百货商场当消费积分最高的八名顾客
//        他们的积分分别是18,25,7,36,13,2,89,63
//        在控制台输出最低的积分以及最低积分所对应的下标
//        int[] jifen =new int[]{18,25,7,36,13,2,89,63};
//        int min=jifen[0];
//        int minIndex=0;
//        for (int i=0;i<jifen.length;i++){
//            if (min>jifen[i]){
//                min=jifen[i];
//                minIndex=i;
//            }
//        }
//        System.out.println("最低的积分是："+min+"最低积分所对应的下标"+minIndex);

//        参加歌手大赛，10位评委给出的分数分别为
//        99,97,96,95,94,92,91,90,88,100
//        请输出一下平均得分（去掉一个最高分和去掉一个最低分）
    }
}
