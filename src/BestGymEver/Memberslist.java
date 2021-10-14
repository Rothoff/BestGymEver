package BestGymEver;

import java.time.LocalDate;
import java.util.List;

public class Memberslist {
    public Member searchList(List<Member> members, String nameSSN){

        for (Member member : members) {
            if (nameSSN.equalsIgnoreCase(member.getName())) {
                return member;
            }
            else if (nameSSN.equals(member.getSsn())) {
                return member;
            }
        }
        return null;
    }
    public boolean compareDate(String date){
        LocalDate dateToday = LocalDate.now();
        LocalDate membersDate = LocalDate.parse(date);
        LocalDate days = membersDate.plusDays(366);
        boolean compare = days.isAfter(dateToday);

        return compare;
    }
}
