package BestGymEver;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MemberslistTest {

    @Test
    void searchList() {
        String name = "Fredrik Rothoff";
        String ssn = "951127";
        assertTrue(name.equalsIgnoreCase(name));
        assertTrue(ssn.equals(ssn));
    }

    @Test
    void compareDate() {
        LocalDate aWhileAgo = LocalDate.now().minusDays(365);
        LocalDate dateToday = LocalDate.now();
        LocalDate inFuture = LocalDate.now().plusDays(365);
        assertTrue(aWhileAgo.isBefore(dateToday));
        assertTrue(dateToday.isAfter(aWhileAgo));
        assertTrue(inFuture.isAfter(dateToday));
    }
}