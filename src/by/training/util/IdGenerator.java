package by.training.util;

public class IdGenerator {
    private static long id = 0;

    public static long getId() {
        return id++;
    }
}
