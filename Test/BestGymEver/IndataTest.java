package BestGymEver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndataTest {

    @Test
    void nameSsn() {
        String name = "Fredrik rothoff";
        String ssn = "951127";
        assertTrue(name.equals(name));
        assertTrue(ssn.equals(ssn));
    }
}