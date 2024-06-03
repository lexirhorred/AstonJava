package homework6.task1;

import java.util.regex.Pattern;

public class Login {
    public static boolean authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String loginRegex = "^\\S*$";
        String passwdRegex = "^\\S*\\d\\S*$";

        if (login == null || login.length() >= 20 || !Pattern.matches(loginRegex, login)) {
            throw new WrongLoginException("Incorrect login.");
        }
        if (password == null || password.length() >= 20 || !Pattern.matches(passwdRegex, password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password.");
        }

        return true;
    }
}
