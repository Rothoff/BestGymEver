package BestGymEver;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileIntoArrayListTest {

    @Test
    void readDataFromFile() throws IOException {
        Path inFilePath = Paths.get("customers.txt");
        Scanner sc = new Scanner(inFilePath);
        sc.next();
        assertEquals(" Alhambra Aromes", sc.nextLine());
    }
}