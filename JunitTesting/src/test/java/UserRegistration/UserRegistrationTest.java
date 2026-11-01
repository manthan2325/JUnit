package UserRegistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private final UserRegistration user = new UserRegistration();

    @Test
    void validateFirstNameShouldPass(){
        assertTrue(user.validateFirstName("Manthan"));
    }
    @Test
    void validLastNameShouldPass() {
        assertTrue(user.validateLastName("Hanchate"));
    }

    @Test
    void invalidLastNameShouldFail() {
        assertFalse(user.validateLastName("hanchate"));
    }
    @Test
    void validEmailShouldPass() {
        assertTrue(user.validateEmail("abc@gmail.com"));
    }

    @Test
    void invalidEmailShouldFail() {
        assertFalse(user.validateEmail("abc@gmail"));
    }
    @Test
    void validMobileShouldPass() {
        assertTrue(user.validateMobile("+91 7219551704"));
    }

    @Test
    void invalidMobileShouldFail() {
        assertFalse(user.validateMobile("99999"));
    }
}
