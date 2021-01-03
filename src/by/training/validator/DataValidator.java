package by.training.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {

    private static final String CORRECT_CONE_DATA = "^-?\\d+\\s-?\\d+\\s-?\\d+\\s-?\\d+\\s-?\\d+\\s-?\\d+\\s-?\\d+$";

    public static boolean isConeCorrect(String input){
        Pattern pattern = Pattern.compile(CORRECT_CONE_DATA);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
