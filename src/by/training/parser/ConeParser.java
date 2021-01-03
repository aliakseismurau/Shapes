package by.training.parser;

import by.training.validator.DataValidator;

import java.util.ArrayList;
import java.util.List;

public class ConeParser {
    private static final String DELIMITER = "\\s";

    public List<Double> parseCone(String data){
        List<Double> coneValues = new ArrayList<>();
        if(DataValidator.isConeCorrect(data)){
            String[] numbers = data.split(DELIMITER);
            for(String number : numbers){
                coneValues.add(Double.parseDouble(number));
            }
        }
        return coneValues;
    }
}
