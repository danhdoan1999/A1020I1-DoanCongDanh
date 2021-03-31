package bai18_string_regex.thuc_hanh.validate_account;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[A-Za-z0-9_]{6,}$";
    private static final String[] arrayString = new String[] {"123abc_", "_abc123",".@", "12345"};
    public static void main(String[] args) {
        for (String arr: arrayString) {
            System.out.println("Account " + arr + " dung dinh dang : "+ arr.matches(ACCOUNT_REGEX));
        }
    }
}
