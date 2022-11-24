package day02;

import java.util.Arrays;

public class day0204 {
    public static void main(String[] args) {
//        数组的工具类（Arrays)
//        java.util.Arrays
        int[] numberArray = new int[]{6,4,7,9,1};

//        利用工具类提供的sort方法，为数组进行排序
        Arrays.sort(numberArray);

//        遍历数组  结果为1，4，6，7，9
//        for(int i =0;i<numberArray.length;i++){
//            System.out.println(numberArray[i]);
//        }

//        toString方法，可以直接在控制台查看数组中的元素
//        System.out.println(Arrays.toString(numberArray));

        for(int i: numberArray){
            System.out.println(i);
        }

    }
}
