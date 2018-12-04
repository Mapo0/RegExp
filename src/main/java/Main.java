import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\+\\d+\\s\\d{3}\\s\\d{3}\\s\\d{2}\\s\\d{2}");
        Matcher m = p.matcher("Notification has been sent 150 times to +4 351 455 22 44 successfully. +1(431) 542 56 12 is unreachable");
        if (m.find()) {
            System.out.print("вывод" + m.start() + m.group());
        } else {
            System.out.print("lol");
        }
    }
}