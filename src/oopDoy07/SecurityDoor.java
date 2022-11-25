package oopDoy07;

public class SecurityDoor extends Door implements Alarm{

    @Override
    public void alarm() {
        System.out.println("安全门拉响了警报"+Alarm.ALARM);
    }

    @Override
    public void open() {
        System.out.println("安全门打开了");
    }

    @Override
    public void close() {
        System.out.println("安全门关闭了");
    }
}
