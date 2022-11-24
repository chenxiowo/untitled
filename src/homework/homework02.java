package homework;

public class homework02 {
    // 编写程序 求100到200中所有能被3整除的数的和
    public static void main(String[] args){
        int sum = 0;
        for(int i=100;i<=200;i++){   //循环加i
            if(i%3 == 0){            //是否被3整除当余数等于0sun+i
                sum+=i;
                System.out.println("能被3整除"+i);//输出可以被3整除的数
            }
        }
        System.out.println("100-200以内所有可以被3整除的和为："+sum);//输出结果
    }
}