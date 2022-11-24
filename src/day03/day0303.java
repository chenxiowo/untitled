package day03;

public class day0303 {
    public static void main(String[] args) {
//        设计一个方法，比较两个整数的大小，得到最大值，输出至控制台
//        System.out.println(getMaxTwo(3,8));

//        比较两个小数的和
//        System.out.println(getdoublesum(9.1,2.2));

//        设计一个方法，比较三个整数的大小，得到最大数。
//        System.out.println(getMaxThree(1,0,2));

//        请设计一个方法，该方法的目的是找到数组中指定元素首次出现的下标
//        若该元素不在数组内，则返回-1
        int[] arr=new int[]{8,4,56,3,4,3};
        System.out.println(getIndex(arr,4));

//        设计一个方法，根据宽度和高度在控制台上输出一个矩形
        getRectangle(4,5);
    }


    public static int getMaxTwo(int numberA,int numberB){
        if(numberA>numberB){
            return numberA;
        }else return numberB;
    }

//    计算两个小数的和
    public static double getdoublesum(double a1, double a2){
        return a1+a2;
    }

    public static int getMaxThree(int numA,int numB,int numC){
        int a = numA > numB ? numA : numB ;
        return a > numC ? a : numC;
    }

    public static int getIndex(int[] arr,int num){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                index = i;
                break;
            }
            if(num!=arr[i]){
                index=-1;
            }
        }
        return index;
    }

    public static void getRectangle(int width,int height){
        for (int i=1; i<=height;i++){
            for(int j=1;j<=width;j++){
                System.out.print("★\t");
            }
            System.out.println();
        }
    }

}
