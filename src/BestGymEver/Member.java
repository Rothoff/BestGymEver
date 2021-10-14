package BestGymEver;

public class Member {
    private String name;
    private String ssn;
    private String date;

    public Member(String ssn, String name, String date) {
        this.name = name;
        this.ssn = ssn;
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public String getDate() {
        return date;
    }
    @Override
    public String toString() {
        return
                "\nSSN: " + ssn +
                "\nNamn: " + name +
                "\nMedlem sen: " + date;
    }
}
