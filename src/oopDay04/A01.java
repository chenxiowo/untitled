package oopDay04;

public class A01 {
    public double max(double[]arr){
//        老师方法
//        先判断arr是否为null，然后在判断length是否>0
        if (arr!=null&&arr.length>0){
            double m=arr[0];
            for (int i=0;i<arr.length;i++){
                if(arr[i]>m){
                    m=arr[i];
                }
            }return m;
        }return 0.0;
    }



////    自己方法
//    double max;
//    public double max(double[] aa){
//        for (int a=0;a<aa.length;a++){
//            if (aa[a]>max){
//                max=aa[a];
//
//            }
//        }return max;
//    }
}
