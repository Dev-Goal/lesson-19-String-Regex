package practice.practice_3;

public class EmailExampleTest {
    private static final String[] validEmail = new String[]{"lmht721@gmail.com","hvphuc20it7@gmail.com"};
    private static final String[] invaliEmail = new String[]{"devgoal.2808@gmail.com","lmht721@gmail.com."};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid " + isValid);
        }

        for (String email : invaliEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is invalid " + isValid);
        }
    }
}
