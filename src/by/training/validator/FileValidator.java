package by.training.validator;

import java.io.File;

public class FileValidator {

    public static boolean isFileValid(String filename){
        if(filename == null){
            return false;
        }
        File file = new File(filename);
        return file.isFile() && !(file.length() == 0);
    }
}
