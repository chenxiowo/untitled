package homework;

public class homework03 {
 /*   参加歌手大赛，10位评委给出的分数分别为
99,97,96,95,94,92,91,90,88,100
    请输出一下平均得分（去掉一个最高分和去掉一个最低分）
    */
        public static void main(String[] args) {
            int [] dada = new int []{99, 97, 96, 95, 94, 92, 91, 90, 88, 100};
            double max = dada[0];
            double min= dada[0];
            double sum= 0;
            double d ;
            for (int a = 0;a<dada.length;a++){
                if (max < dada [a]) {max=dada[a];

                }if(min >dada [a]){
                    min = dada[a];

                }
                sum+=dada[a];
            }
            d=sum-min-max;
            System.out.println("最大分数"+max);
            System.out.println("最小分数"+min);
            System.out.println("总分"+sum);
            System.out.println("最终得分"+d);
            System.out.println("平均分数"+(d/(dada.length-2)));
        }
    }
