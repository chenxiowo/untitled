package day02;

public class day0202 {
    public static void main(String[] args) {
//        鸡兔同笼   一个有35个头   94只脚

//        方法1：
//        for(int tu = 0 ;tu <= 35 ; tu ++){
////            根据兔子的数量计算鸡的数量
//            int ji = 35 - tu;
////            计算兔子和鸡的脚
//            if( tu * 4 +ji * 2 == 94) {
//                System.out.println("兔子的数量是："+ tu +
//                        ",鸡的数量是：" + ji);
//                break;
//            }
//        }
//        方法2：
//        int tu =0;
//        int ji =35;
//        for ( ; tu<=35 ; tu++){
////            计算兔子和鸡的脚
//           if( tu * 4 +ji * 2 == 94) {
//                System.out.println("兔子的数量是："+ tu +
//                        ",鸡的数量是：" + ji);
//                break;
//            }
//           ji--;
//        }

//        有一个工人甲，工资是三位数ABC元(一个字母代表0~9中一个数字),
//        组内其他五个人的工资可以这样表示：ACB,BAC,BCA,CAB,CBA.
//        且这五个工人的工资总额为3194 ，请问工人甲的工资具体是多少？
//        for(int salary=100;salary <=999 ;salary ++){
////            分解出各个位上的数
//            int a = salary /100;
//            int b = salary /10 %10;
//            int c = salary % 10;
//
////          计算组内其他五个工人的工资
//            int temp =(a+b*2+c*2)*100 +(a*2+b+c*2)*10+ (a*2+b*2+c);
//            if (temp ==3194){
//                System.out.println("工人甲的工资是："+salary);
//                break;
//            }
//        }

//        方法2
//        int a =1, b=0,c=0;
//        int count =0;//统计循环次数
//        ok:
//        for( ; a<=9 ;a++){
//            for (b=0; b<=9;b++){
//                for (c=0;c<=9;c++){
//                    count ++;//循环次数累加
//                    System.out.println(""+a+b+c);
//
//                    //          计算组内其他五个工人的工资
//                    int temp =(a+b*2+c*2)*100 +(a*2+b+c*2)*10+ (a*2+b*2+c);
//
//                    if (temp ==3194){
//                        break ok;
//                    }
//                }
//            }
//        }
//        System.out.println("循环次数："+count);
//        System.out.println("工人甲的工资是："+a+b+c);


//        判断某个数是不是质数？
//        质数（素数）定义：只能被1和它本身整除的数
//            int n = 114;
//            int count =0; //记录在[2,n-1]区间能整除的数的数量
////          检验[2,n-1]区间，有没有数能被n整除
//        for( int i = 2; i < n ;i++){
//            if (n%i==0){
//                count++;
//                break;
//            }
//        }
//        if ( n >1 && count ==0){
//            System.out.println(n+ "是质数！");
//        }else {
//            System.out.println(n+"不是质数！");
//        }

//        方法2
//            int n =3;
//            for (int i=2 ; i<=n;i++){
//                if(i==n){
//                    System.out.println(n+"是质数");
//                    break;
//                }
//                if(n%i==0){
//                    System.out.println(n+"不是质数");
//                    break;
//                }
//            }

//        求 100 到 200中 所有质数的和、
//        int sum = 0;
//        for(int n =100 ; n<=200 ; n++){
////            判断n是否是质数
//           int count =0;//记录在[2,n-1]区间能整除的数的数量
////            检验[2,n-1]区间，有没有数能被n整除
//            for(int i=2; i<n;i++){
//                if(n%i==0){
//                    count++;
//                    break;
//                }
//            }
//            if (n>1&&count==0){
//                System.out.println(n+"是质数！");
//                sum += n ;
//            }
//        }
//        System.out.println(sum);


    }
}
