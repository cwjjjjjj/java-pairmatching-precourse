package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputView{
    public static List<String> readFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readAllLines(path);
    }

    public static String selectFunction() {
        return input();
    }

    public static String selectMission() {
        return input();
    }

    private static String input() {
        return Console.readLine();
    }
}
