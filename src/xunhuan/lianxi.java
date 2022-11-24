package xunhuan;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class lianxi {
    public static void main(String[] args) {
//        有一个工人甲，工资是三位数ABC元(一个字母代表0~9中一个数字),
//        组内其他五个人的工资可以这样表示：ACB,BAC,BCA,CAB,CBA.
//        且这五个工人的工资总额为3194 ，请问工人甲的工资具体是多少？
//        for(int d=100;d <=999 ;d ++){
////            分解出各个位上的数
//            int a = d /100;
//            int b = d /10 %10;
//            int c = d % 10;
//
////          计算组内其他五个工人的工资
//            int f =(a+b*2+c*2)*100 +(a*2+b+c*2)*10+ (a*2+b*2+c);
//            System.out.println(f);
//            if (f ==3194){
//                System.out.println("工人甲的工资是："+d);
//                break;
//            }
//        }
//                方法2
//        int a =1, b=0,c=0;
//        int e =0;//统计循环次数
//        aa:
//        for( ; a<=9 ;a++){
//            for (b=0; b<=9;b++){
//                for (c=0;c<=9;c++){
//                    e ++;//循环次数累加
//                    System.out.println(""+a+b+c);
//
//                    //          计算组内其他五个工人的工资
//                    int f =(a+b*2+c*2)*100 +(a*2+b+c*2)*10+ (a*2+b*2+c);
//
//                    if (f ==3194){
//                        break aa;
//                    }
//                }
//            }
//        }
//        System.out.println("循环次数："+e);
//        System.out.println("工人甲的工资是："+a+b+c);


//                判断某个数是不是质数？
//                int n =4;
//            System.out.printf("请输入一个数字:");
//            Scanner QAQ = new Scanner(System.in);
//            int n = QAQ.nextInt();
//            for (int i = 2; i <= n; i++) {
//                if (i == n) {
//                    System.out.println(n + "是质数");
//                    break;
//                }
//                if (n % i == 0) {
//                    System.out.println(n + "不是质数");
//                    break;
//                }
//            }
        int sum=0;
            for(int i=100;i<=200;i++){
                for (int p=2;p<=i;p++){
                    if (p==i){
                        sum+=i;
                        break;
                    }
                    if (i%p==0){
                        break;
                    }
                }
            }System.out.println("100~200之间的质数的和"+sum);









    }
}
