import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args ){
        String text = "Завтра в 09:00";
        Pattern pattern = Pattern.compile("\\b(?:[01][0-9]|2[0-3]):[0-5][0-9]\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

    }
}
