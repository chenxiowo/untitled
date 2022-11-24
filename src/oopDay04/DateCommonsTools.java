package oopDay04;

public class DateCommonsTools extends MyDate{
    public DateCommonsTools() {
    }

//    根据星期值，返回对应英文单词
    public static String getWeekName(int week){
        String[] arr=new String[]{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        if (week<0||week>6){
            return "输入不合法";
        }
        return arr[week];
    }
    public static String getMonthName(int month) {
        String[] arr = new String[] { "January", "February", "March", "April", "May", "June", "July","August",
                "September","October","November","December"};
        if (month < 0 || month > 11)
            return "输入不合法";
        return arr[month];
    }
    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("是闰年");
        }
        return false;

    }
    public static int getTotalDaysOfMonth(int year,int month){
        int res=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                res=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                res=30;
                break;
            case 2:
                if (isLeapYear(year)){
                    res=29;
                }else {
                    res=28;
                }
            default:
                res=0;
                break;
        }return res;
    }
    public static int getTotalDaysOfYear(int year){
        if (isLeapYear(year)){
            return 366;
        }else return 365;
    }
}
