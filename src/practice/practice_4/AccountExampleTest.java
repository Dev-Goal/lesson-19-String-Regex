package practice.practice_4;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static final String[] validAccount = new String[]{"phuc","phuc123","phuc_20ad"
            ,"_phuc20ad","123456","_______","@phuc2808","phuc20ad_"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account " + account + " is " + isValid);
        }
    }
}
