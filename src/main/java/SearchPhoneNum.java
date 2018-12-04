
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchPhoneNum {
    private static final String Phones = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\RegExp\\phones.txt";
    private static final String PhonesFormatted = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\RegExp\\phones.txt";


    private void phoneNum() {
        String inputString = "Sample line of text: \"Notification has been sent 150 times to +4(351) 455 22 44 successfully. +1(431) 542 56 12 is unreachable";
        String pattern = "\\+\\d+\\s(\\d{3})\\s\\d{3}\\s\\d{2}\\s\\d{2}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(inputString);

        if (m.find()) {
            System.out.print("Phone number" + m.group());
        } else {
            System.out.print("not found");
        }

    }
}
