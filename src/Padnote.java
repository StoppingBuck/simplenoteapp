import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mp on 03/02/2017.
 */
public class Padnote {

    // Everything starts here
    public static void main(String[] args) throws IOException {

        // Initializing variables
        Scanner scan = new Scanner(System.in);


        System.out.println("Hello. Please enter your name: ");
        String name = scan.nextLine();

        System.out.println("Hello " + name + ". Please enter something to save: (press Enter twice to quit)");

        String line;
        List<String> lines = new ArrayList<>();
        lines.add("First");

        // TODO: CREATE String line FROM THE NextLine() AND DO lines.add(line) HERE!!!
        while ((line=scan.nextLine()) != "") {
            System.out.println(line);
            lines.add(line);
        }

        for (String s : lines) { System.out.println(s);}
        Path file = Paths.get("test.txt");
        Files.write(file, lines);
    }
}
