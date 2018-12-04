import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        SearchPhoneNum searchPhoneNum = new SearchPhoneNum();
        System.out.println(searchPhoneNum.read());
        System.out.println(searchPhoneNum.selectNum());
        searchPhoneNum.write();
    }

}