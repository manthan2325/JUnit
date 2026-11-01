package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final Pattern FIRST_NAME = Pattern.compile("^[A-Z][a-z]{2,}$");

    private static final Pattern LAST_NAME =
            Pattern.compile("^[A-Z][a-z]{2,}$");


    public boolean validateFirstName(String firstName) {
        return firstName != null && FIRST_NAME.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        return lastName != null && LAST_NAME.matcher(lastName).matches();
    }
}
