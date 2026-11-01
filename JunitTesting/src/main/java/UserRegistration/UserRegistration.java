package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final Pattern FIRST_NAME = Pattern.compile("^[A-Z][a-z]{2,}$");

    public boolean validateFirstName(String firstName) {
        return firstName != null && FIRST_NAME.matcher(firstName).matches();
    }
}
