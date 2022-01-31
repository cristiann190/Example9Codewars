package src;

public class HumanReadableTime {
    protected static String makeReadable(int time) {
        int hour = time / 3600;
        time = time % 3600;
        int minute = time / 60;
        int second = time % 60;
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}