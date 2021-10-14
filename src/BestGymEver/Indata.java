package BestGymEver;

import java.util.Scanner;

public class Indata {

    public String nameSsn (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange fullständigt namn eller personnummer");
        String indata = sc.nextLine();
        return indata;
    }
}
