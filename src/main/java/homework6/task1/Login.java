package homework6.task1;

import java.util.regex.Pattern;

public class Login {
    public static boolean authorization(String login, String password, String confirmPassword) {
        String loginRegex = "^\\S*$";
        String passwdRegex = "^\\S*\\d\\S*$";

        try {
            if (login.length() >= 20 || !Pattern.matches(loginRegex, login)) {
                throw new WrongLoginException("Login must not contain spaces");
            }
            if (password.length() >= 20 || !Pattern.matches(passwdRegex, password) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password must not contain spaces and must contain one or more digits and must be equals to confirmPassword");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        }
    }
}
