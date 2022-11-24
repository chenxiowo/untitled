package homework;
//求1~100的偶数之和（类和主函数要写全）
public class homework01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int b =1; b<=100;b++){
            if (b%2==0){
                sum=sum+b;
            }

        }
        System.out.println(sum);
    }
}
