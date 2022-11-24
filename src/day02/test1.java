package day02;

public class test1 {
    public static void main(String[] args) {
        int c=0;
        int[] a =new int[]{3,1,4,8,21,9,11,5,3};
        for (int b=0;b<a.length;b++){
            if (a[b]>c){
                c=a[b];
            }
        }
        System.out.println("数组值最大的元素是"+c);
    }
}
