
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchPhoneNum {
    private static final String Phones = "C:\\Users\\User\\IdeaProjects\\RegExp\\phones.txt";
    private static final String PhonesFormatted = "C:\\Users\\User\\IdeaProjects\\RegExp\\newPhones.txt";


    public   String read()  {
        String result="";
        try {
            Reader reader = new FileReader("phones.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> Read = null;
        try {
            Read = Files.readAllLines(Paths.get(Phones),StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String line: Read){
            result+=line;
        }
        return result;
    }

    public String selectNum()  {
        String result="";
        Pattern p = Pattern.compile("\\+\\d+\\s(\\d{3})\\s\\d{3}\\s\\d{2}\\s\\d{2}");
        Matcher m =p.matcher(read());
        while (m.find()){
            result=result.concat(m.group().replaceAll("\\D", "")+"\n");
        }
        return result;
    }
    public void write(){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(PhonesFormatted), "utf-8"))) {
            writer.write(selectNum());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
