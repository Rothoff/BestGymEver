package BestGymEver;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WritetoFile wf = new WritetoFile();
        ReadFileIntoArrayList ra = new ReadFileIntoArrayList();
        List<Member> members = ra.readDataFromFile();
        Memberslist ml = new Memberslist();
        Indata id = new Indata();
        String nameSSN = id.nameSsn();


      Member member = ml.searchList(members, nameSSN);
      if (member == null){
          System.out.println(nameSSN + " har aldrig varit medlem");
          System.exit(0);
      }
      if (ml.compareDate(member.getDate())){
          wf.writer(member.getName() + " - " + member.getSsn() + ", besökte gymmet: " + LocalDate.now());
          System.out.println(member.getName() + " är medlem sedan: " + member.getDate());
        } else {
          System.out.println(nameSSN + " är inte medlem. senast betald årsavgift: " + member.getDate());
      }
    }
}


