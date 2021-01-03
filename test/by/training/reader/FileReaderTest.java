package by.training.reader;

import by.training.exception.ReaderException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FileReaderTest {
    FileReader fileReader = new FileReader();
    @Test
    public void testReadData() throws ReaderException {
        List<String> lines = new ArrayList<>();
        lines.add("0.0, 0.0, 0.0, 0.0, 4.0, 0.0, 5.0");
        List<String> actual = fileReader.readData("res/data.txt");
        List<String> expected = lines;
        Assert.assertEquals(actual, expected);
    }
}
