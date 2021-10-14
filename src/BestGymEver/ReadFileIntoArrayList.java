package BestGymEver;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileIntoArrayList {
    public List<Member> readDataFromFile() {

        String firstLine;
        String secondLine;
        Path inFilePath;
        List<Member> personList = new ArrayList<>();

        String[] personDataPartsFirstLine = new String[3];
        String[] personDataPartsSecondLine = new String[2];
        inFilePath = Paths.get("customers.txt");

        try (Scanner fileScanner = new Scanner(inFilePath)) {

            while (fileScanner.hasNext()) {
                firstLine = fileScanner.nextLine();
                personDataPartsFirstLine = firstLine.split(",");
                if (fileScanner.hasNext()) {
                    secondLine = fileScanner.nextLine();
                    personDataPartsSecondLine = secondLine.split(" ");
                }

                Member m = new Member(personDataPartsFirstLine[0].trim(), personDataPartsFirstLine[1].trim(),
                        personDataPartsSecondLine[0].trim());

                personList.add(m);
            }
        }  catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return personList;
    }
}

