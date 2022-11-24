package day02;

public class erwei {
    public static void main(String[] args) {
//        int[][]arr={{13,13,14},{15,16,17},{18,28,38}};
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("---------------");
//        for (int[]i:arr){
//            for (int ii:i){
//                System.out.print(ii+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("-------------------");
//
//        int[]arr6={1,2,3,4};
//        for (int i=0;i<arr6.length;i++){
//            arr6[i]+=10;
//        }
//        for (int i:arr6){
//            System.out.println(i);
//        }
//        System.out.println("--------------");


//        int[][]arr2=new int[][]{{1,2,3},{4,15},{6}};
//        int sun=0;
//        int max=0;
//        int count=0;
//        for (int i=0;i<arr2.length;i++){
//            for (int j=0;j<arr2[i].length;j++){
//                sun+=arr2[i][j];
//                if (arr2[i][j]>max){
//                    max=arr2[i][j];
//                }
//                count++;
//            }
//        }
//        System.out.println("平均数"+(double)(sun/count));
//        System.out.println("总和" + sun);
//        System.out.println("最大值"+max);
        int[][]arr=new int[][]{{50,60,55},{70,70,70},{80,90,70},{99,88,88,55}};
        double   max_sum=0;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            int sum1=0;
            for (int j=0;j<arr[i].length;j++){
                sum1+=arr[i][j];
            }
            System.out.println("第"+(i+1)+"个人的总成绩"+sum1);
            if (sum1>sum){
                sum=sum1;
            }
            System.out.println("第"+(i+1)+"的平均分"+(double)sum/arr[i].length);
            if (max_sum<sum/(double)arr[i].length){
                max_sum=sum/(double)(arr[i].length);
            }
        }
        System.out.println("总成绩最高分"+max_sum);
        System.out.println("最高平均分的分数"+max_sum);




    }
}
