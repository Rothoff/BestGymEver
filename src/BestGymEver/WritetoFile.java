package BestGymEver;

import java.io.*;

public class WritetoFile {
    public void writer(String input) {
        File file = new File("ValidCustomers.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.println(input);
        pw.close();

    }

}


