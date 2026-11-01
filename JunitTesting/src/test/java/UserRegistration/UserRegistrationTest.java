package UserRegistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private final UserRegistration user = new UserRegistration();

    @Test
    void validateFirstNameShouldPass(){
        assertTrue(user.validateFirstName("Manthan"));
    }
}
