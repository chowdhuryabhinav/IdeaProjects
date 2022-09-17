package Java8Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOEnhancements {

    public static void main(String[] args) {
        Path path = Paths.get("d:", "tmp", "debug.log");
        try (Stream<String> stream = Files.lines(path)) {

            stream.filter(line -> line.contains("ERROR"))
                    .findFirst()
                    .ifPresent(System.out::println);

        } catch (IOException ioe) {

        }
    }
}
