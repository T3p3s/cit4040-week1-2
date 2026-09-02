public class SecurityCheck {
    public static void main(String[] args) {
        String role = "user";
        if ("admin".equals(role)) {
            System.out.println("Access granted");
        }
    }
}
// using .equals() on the string (which is guaranteed to never be null) which means 'role' is never null, it will not throw the NullPointerException, but 'false'