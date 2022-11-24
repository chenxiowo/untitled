package day07;

public class day0704 {
    public static void main(String[] args) {
        int[] qqq={7,9,1,5,11,3,1,4};//11,4
        func(qqq);
    }
    public static void func(int[] arr){
        int max=arr[0];
        int max_id=0;
        for (int i =0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                max_id=i;
            }
        }
        System.out.println("数组里的最大值是"+max+"下标是："+max_id);

    }
}
