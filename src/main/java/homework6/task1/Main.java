package homework6.task1;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Login.authorization("HelloHelloHelloHelloHello", "o1pb3", "o1pb3"));
            System.out.println(Login.authorization("Hello HelloHello", "hh5hh", "hh5hh"));
            System.out.println(Login.authorization("HelloHelloHello", "hh5hh", "hh5hh"));
            System.out.println(Login.authorization("HelloHelloHello", "hh5hh6", "hh5hh5"));
            System.out.println(Login.authorization("HelloHelloHello", "hh5 hh5", "hh5 hh5"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Authorization error: " + e.getMessage());
        }
    }
}
